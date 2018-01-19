package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hyusuf on 2018-01-18.
 */

public class Sad extends Mood {
    public Sad() {
        super(new Date());
    }

    public Sad(Date date) {
        super(date);
    }
    public String currentMood(){
        return "Sad";
    }
}
