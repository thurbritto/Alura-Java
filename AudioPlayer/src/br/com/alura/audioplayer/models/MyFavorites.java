package br.com.alura.audioplayer.models;

public class MyFavorites {
    public void add(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " é um sucesso!");
        } else if (audio.getRating() >= 7) {
            System.out.println(audio.getTitle() + " é um bom conteúdo!");
        } else {
            System.out.println(audio.getTitle() + " merece uma chance!");
        }
    }
}
