package oops.interfaces;

interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive content allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.contains("badword");
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam content allowed.");
    }
}

class ContentModerator
        implements TextModeration, SpamDetection {

    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean isSpam(String post) {
        return post.contains("Buy Now");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationSystem {

    public static void main(String[] args) {

        String[] posts = {
                "Hello everyone",
                "Buy Now and get discount",
                "This contains badword",
                "Welcome to our page"
        };

        ContentModerator moderator =
                new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            if (moderator.isSpam(post)) {
                System.out.println("Spam Post: " + post);
            } else if (moderator.isOffensive(post)) {
                System.out.println("Offensive Post: " + post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}
