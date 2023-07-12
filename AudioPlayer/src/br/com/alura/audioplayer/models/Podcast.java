package br.com.alura.audioplayer.models;

public class Podcast extends Audio {
    private String host;
    private String guest;
    private String description;

    @Override
    public int getRating() {
        if (this.getLikes() >= 2000) {
            return 9;
        } else if (this.getLikes() >= 1000){
            return 7;
        } else {
            return 5;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
