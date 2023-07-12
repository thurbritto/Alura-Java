package br.com.alura.audioplayer.models;

public class Music extends Audio {
    private String artist;
    private String album;
    private String genre;

    @Override
    public int getRating() {
        if (this.getTotalReproductions() >= 5000) {
            return 9;
        } else if (this.getTotalReproductions() >= 2000) {
            return 7;
        } else {
            return 5;
        }
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
