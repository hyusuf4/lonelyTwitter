/*
 * Copyright (c) 2018 Team X. Cmput301.University of Alberta- All Rights Reserved.
 *  You may use, distribute or modify this code under terms and conditions of Code of Student Behavior at
 * University of Alberta.
 * You can find a copy of the licence in this project.Otherwise,please contact contact@abc.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * interface to distiguish a tweetable tweet
 *
 * Created by dezfuli on 1/16/18.
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 * @see ca.ualberta.cs.lonelytwitter.ImportantTweet
 */
import java.util.Date;

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
