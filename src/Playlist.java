import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist{
    private List<Song> playlist;

    public Playlist() {
        this.playlist = new ArrayList<>();
    }
    public void addSong(Song songToAdd) {
        if (playlist.size() >= 1000) {
            System.out.println("Playlist is full, you can't add another song");
        }
        playlist.add(songToAdd);
    }

    public void printPlaylist() {
        for (Song song : playlist) {
            song.printSong();
        }
    }

    public void printAlbum(String albumName) {
        for (Song song : playlist) {
            if (albumName.equalsIgnoreCase(song.getAlbum())) {
                song.printSong();
            }
        }
    }

    public void printGenre(String genreName) {
        for (Song song : playlist) {
            if (genreName.equalsIgnoreCase(song.getGenre())) {
                song.printSong();
            }
        }
    }

    public void printArtist(String artistName) {
        for (Song song : playlist) {
            if (artistName.equalsIgnoreCase(song.getArtist())) {
                song.printSong();
            }
        }
    }

    public void removeSong(String songTitle) {
        playlist.removeIf(song -> songTitle.equalsIgnoreCase(song.getTitle()));
    }
    public int returnMostPlayed(Song songOne, Song songTwo) {
        return Integer.compare(songOne.getPlays(), songTwo.getPlays());
    }
    public void topTenPlayed() {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int index = 0; index < playlist.size() - 1; index++) {
                if (returnMostPlayed(playlist.get(index), playlist.get(index + 1)) < 0) {
                    Collections.swap(playlist, index, index + 1);
                    flag = false;
                }
            }
        }
    }







}
