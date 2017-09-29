/*
 * Copyright (c) Mark Kamprath CMPUT 301, University of Alberta - All rights Reserved. You may use
 *
 *  Tweet
 *
 *  Version 3.0
 *
 *  Created by mkamprat on 9/14/17.
 *
 */

package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author YourName
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable { //abstract class can't be instantiated
    private String message; /* access modifier */
    private Date date;

    // The following constructors, which is why they share a name.
    public Tweet(String message) {
        this.message = message;
        this.date = new Date(); // sets date to current date
    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */



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

    /**
     * Sets tweet messages
     * @param message Tweet message
     * @throws TweettooLongException
     */

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}


