import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylistRecommendationEngine {

    static LinkedList<String> playlist = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    // Play Song
    static void playSong() {

        System.out.print("Enter Song Name: ");
        String song = sc.nextLine();

        // If song already exists, remove it so it can be added to the top
        if (playlist.contains(song)) {
            playlist.remove(song);
        }

        // Add at the beginning
        playlist.addFirst(song);

        // Keep only the latest 10 songs
        if (playlist.size() > 10) {
            playlist.removeLast();
        }

        System.out.println("Song added to Recently Played.");
    }

    // Search Song
    static void searchSong() {

        System.out.print("Enter Song Name: ");
        String song = sc.nextLine();

        if (playlist.contains(song)) {
            System.out.println("Song found in Recently Played.");
        } else {
            System.out.println("Song not found.");
        }
    }

    // Display Playlist
    static void displayPlaylist() {

        if (playlist.isEmpty()) {
            System.out.println("No songs in Recently Played.");
            return;
        }

        System.out.println("\n===== Recently Played Songs =====");

        int i = 1;

        for (String song : playlist) {
            System.out.println(i + ". " + song);
            i++;
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== MUSIC PLAYLIST RECOMMENDATION ENGINE =====");
            System.out.println("1. Play Song");
            System.out.println("2. Search Song");
            System.out.println("3. Display Recently Played");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    playSong();
                    break;

                case 2:
                    searchSong();
                    break;

                case 3:
                    displayPlaylist();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}