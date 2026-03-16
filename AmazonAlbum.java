public class AmazonAlbum {
    private String name;
    private final Song[] songs;
    private final int numberOfSongs;

    public AmazonAlbum(String name, Song[] songs, int numberOfSongs) {
        this.name = name;
        this.songs = songs;
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    public String toString() {
        return String.format("%s Album", name);
    }

    public String getName() {
        return name;
    }

    public Song[] getSongs() {
        return songs;
    }

    // Optional helper (not required, but useful)
    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public String someMethodForTest() {
        return 0;
    }

}