/*
 * Copyright (c) 2018 Team X. Cmput301.University of Alberta- All Rights Reserved.
 *  You may use, distribute or modify this code under terms and conditions of Code of Student Behavior at
 * University of Alberta.
 * You can find a copy of the licence in this project.Otherwise,please contact contact@abc.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweet
 * Version 1.0
 * Feb 1,2018
 *
 *
 * Copyright (c) 2018 Team X. Cmput301.University of Alberta- All Rights Reserved.
 * You may use, distribute or modify this code under terms and conditions of Code of Student Behavior at
 *University of Alberta.
 *You can find a copy of the licence in this project.Otherwise,please contact contact@abc.ca
 */

/**
 * Represents a tweet
 *
 * @author hyusuf
 *
 * @ version 1.0
 * @see ImportantTweet
 * @see NormalTweet
 *
 *
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet instance using the given message
     * @param message the message of the tweet
     *
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){return message;}

    /**
     * sets the message of the tweet
     * @param message
     * @throws TweetTooLongException is thrown when the message is over 140 characters
     * @see ImportantTweet
     * @see NormalTweet
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     *  gets the current date
     * @return the current date
     */
    public Date getDate(){
        return date;
    }

    /**
     * sets the date
     * @param date
     *
     */
    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * changes the date and message to a string
     * @return date and tweet message in a string
     */
    @Override
    public String toString() {
        return date.toString()+ " | "+ message.toString();
    }
}
