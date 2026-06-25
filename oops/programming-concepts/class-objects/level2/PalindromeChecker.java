class Palindrome {

    private String text;

    public Palindrome(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {

        if (isPalindrome())
            System.out.println(text + " is a palindrome.");
        else
            System.out.println(text + " is not a palindrome.");
    }
}

public class PalindromeChecker {

    public static void main(String[] args) {

        Palindrome p = new Palindrome("madam");

        p.displayResult();
    }
}