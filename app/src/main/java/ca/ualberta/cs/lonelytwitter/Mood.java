package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hyusuf on 2018-01-18.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        this.date= new Date();
    }
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String currentMood();
}
