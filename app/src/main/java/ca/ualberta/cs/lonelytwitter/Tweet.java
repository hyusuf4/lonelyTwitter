package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hyusuf on 2018-01-18.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moodslist;

    public Tweet(String message) {
        this.message = message;
        this.date=new Date();

    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tweet(String message, Date date) {

        this.message = message;
        this.date = date;
    }
    public void setMessage(String message)throws TweetTooLongException{
        if(message.length()>140){
            throw new TweetTooLongException();
        }
        else{
            this.message=message;
        }
    }
    public abstract Boolean isImportant();

    public void add_Mood(Mood mood){
        moodslist=new ArrayList<Mood>();
        moodslist.add(mood);

    }



}
