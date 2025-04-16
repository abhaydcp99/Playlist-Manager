package playlist;

public class PlaylistDemo {
    private SongNodeDemo last;

    public void addSong(String title, String artist) {
        SongNodeDemo newSong = new SongNodeDemo(title, artist);
        if (last == null) {
            last = newSong;
            last.next = last;  // Circular Link
        } else {
            newSong.next = last.next;
            last.next = newSong;
            last = newSong;
        }
        System.out.println("Song added: " + title + " by " + artist);
    }

    public void removeSong(String title) {
        if (last == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        SongNodeDemo current = last.next, prev = last;
        do {
            if (current.title.equals(title)) {
                if (current == last && current.next == last) { // Only one song
                    last = null;
                } else {
                    prev.next = current.next;
                    if (current == last) {
                        last = prev;
                    }
                }
                System.out.println("Removed: " + title);
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);
        
        System.out.println("Song not found.");
    }

    public void playNext() {
        if (last == null) {
            System.out.println("No songs in the playlist.");
            return;
        }
        last = last.next;
        System.out.println("Now playing: " + last.title + " by " + last.artist);
    }

    public void playPrevious() {
        if (last == null) {
            System.out.println("No songs in the playlist.");
            return;
        }
        SongNodeDemo temp = last;
        while (temp.next != last) {
            temp = temp.next;
        }
        last = temp;
        System.out.println("Now playing: " + last.title + " by " + last.artist);
    }

    public void displayCurrentSong() {
        if (last == null) {
            System.out.println("No songs in the playlist.");
        } else {
            System.out.println("Currently playing: " + last.title + " by " + last.artist);
        }
    }
}

