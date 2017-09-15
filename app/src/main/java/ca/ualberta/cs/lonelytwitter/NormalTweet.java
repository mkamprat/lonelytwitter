package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mkamprat on 9/14/17.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

