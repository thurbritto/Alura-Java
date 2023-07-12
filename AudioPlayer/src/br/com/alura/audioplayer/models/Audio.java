package br.com.alura.audioplayer.models;

public class Audio {
    private String title;
    private String duration;
    private int totalReproductions;
    private int likes;
    private int rating;

    public void like() {
        this.likes++;
    }

    public void play() {
        this.totalReproductions++;
    }


    // Getters e setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

}
