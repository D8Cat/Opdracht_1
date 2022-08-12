public class Main {
    public static void main(String[] args) {
        Song testSong = new Song("test100", "me", "Trying", "Disco", 3.45f, 100);
        Song testSong2 = new Song("test25", "me", "Trying", "Disco", 3.45f, 25);
        Song testSong3 = new Song("test3", "me", "Trying", "Disco", 3.45f, 3);
        Song testSong4 = new Song("test400", "me", "Trying something new", "Disco", 3.45f, 400);
        Song testSong5 = new Song("test5", "me", "Trying something new", "Disco", 3.45f, 5);

        Playlist playlist = new Playlist();
        playlist.addSong(testSong);
        playlist.addSong(testSong2);
        playlist.addSong(testSong3);
        playlist.addSong(testSong4);
        playlist.addSong(testSong5);

        playlist.topTenPlayed();
        playlist.printPlaylist();






    }
}