/*
 * Copyright (c) 2018 Team X. Cmput301.University of Alberta- All Rights Reserved.
 *  You may use, distribute or modify this code under terms and conditions of Code of Student Behavior at
 * University of Alberta.
 * You can find a copy of the licence in this project.Otherwise,please contact contact@abc.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

/**
 *
 * represents a normal Tweet
 *
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

public class NormalTweet extends Tweet {
    /**
     * constructs an instance of a normal tweet given a message
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * constructs an instance of a normal tweet given a message and date
     * @param message
     * @param date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * checks if the current tweet is important
     * @return boolean
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
