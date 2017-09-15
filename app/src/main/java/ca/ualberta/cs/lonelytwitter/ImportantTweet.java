package ca.ualberta.cs.lonelytwitter;

/**
 * Created by mkamprat on 9/14/17.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
