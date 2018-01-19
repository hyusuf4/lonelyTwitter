package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hyusuf on 2018-01-18.
 */

public class Happy extends Mood {
    public Happy(){
        super(new Date());
    }

    public Happy(Date date) {
        super(date);
    }
    @Override
    public String currentMood() {
        return "Happy";
    }


}
