package playlist;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        PlaylistDemo playlist = new PlaylistDemo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play Next Song");
            System.out.println("4. Play Previous Song");
            System.out.println("5. Display Current Song");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Song Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Artist: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(title, artist);
                    break;
                case 2:
                    System.out.print("Enter Song Title to Remove: ");
                    String removeTitle = scanner.nextLine();
                    playlist.removeSong(removeTitle);
                    break;
                case 3:
                    playlist.playNext();
                    break;
                case 4:
                    playlist.playPrevious();
                    break;
                case 5:
                    playlist.displayCurrentSong();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
