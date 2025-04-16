package playlist;

class SongNodeDemo {
    String title, artist;
    SongNodeDemo next;

    public SongNodeDemo(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }
}
