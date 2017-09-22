package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
/**
 * Created by mkamprat on 9/14/17.
 */

public abstract class Tweet implements Tweetable { //abstract class can't be instantiated
    private String message; /* access modifier */
    private Date date;

    // The following constructors, which is why they share a name.
    public Tweet(String message) {
        this.message = message;
        this.date = new Date(); // sets date to current date
    }



    public void setDate(Date date) {
        this.date = date;
    }
    public void setMessage(String message) throws TweettoolongException {
        if (message.length() < 140){
            this.message = message;
        }
        else {
            throw new TweettoolongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public abstract Boolean isImportant();
    {
        //return Boolean.TRUE;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}


