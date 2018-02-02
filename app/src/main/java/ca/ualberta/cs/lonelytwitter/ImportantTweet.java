/*
 * Copyright (c) 2018 Team X. Cmput301.University of Alberta- All Rights Reserved.
 *  You may use, distribute or modify this code under terms and conditions of Code of Student Behavior at
 * University of Alberta.
 * You can find a copy of the licence in this project.Otherwise,please contact contact@abc.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

/**
 *  Important Tweet
 *
 *  Represent an Important Tweet
 *
 *  Version 1.0
 *@see ca.ualberta.cs.lonelytwitter.Tweet
 *
 */
import java.util.Date;

public class ImportantTweet extends Tweet {
    /**
     * constructs an instance important tweet given a message
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * constructs an instance of important tweet given a message and a date
     * @param message
     * @param date
     */

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     *
     * shows if the current tweet is important
     * @return Boolean
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
