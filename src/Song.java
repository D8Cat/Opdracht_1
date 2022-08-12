public class Song  implements Comparable<Song>{
    private final String title, artist, album, genre;
    private final float length;
    private int plays;


    public Song(String title, String artist, String album, String genre, float length) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.length = length;
        this.plays = 0;
    }

    public Song(String title, String artist, String album, String genre, float length, int plays) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.length = length;
        this.plays = plays;
    }

    @Override
    public int compareTo(Song otherSong) {
        return Integer.compare(getPlays(), otherSong.getPlays());
    }


    public void printSong() {
        System.out.println(this.title);
    }

    public void playSong() {
        this.plays++;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public int getPlays() {
        return plays;
    }

    public float getLength() {
        return length;
    }
}
