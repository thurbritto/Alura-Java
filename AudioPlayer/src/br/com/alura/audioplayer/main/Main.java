package br.com.alura.audioplayer.main;

import br.com.alura.audioplayer.models.Music;
import br.com.alura.audioplayer.models.MyFavorites;
import br.com.alura.audioplayer.models.Podcast;

public class Main {
    public static void main(String[] args) {
        // Criando uma música para testes
        Music music = new Music();
        music.setArtist("Post malone");
        music.setTitle("Congratulations");
        music.setAlbum("Stoney");
        music.setGenre("Hip-hop/rap");
        music.setDuration("3:41");

        // Dando likes e reproduzindo
        for (int i = 0; i < 5000; i++) {
            music.like();
        }
        for (int i = 0; i < 8000; i++) {
            music.play();
        }

        // Criando um podcast para testes
        Podcast podcast = new Podcast();
        podcast.setHost("Paulo Silveira");
        podcast.setGuest("David Meth, Caio Teixeira, Mário Souto e Roberta Arcoverde");
        podcast.setTitle("Techguide: Clean code – Hipsters Ponto Tech #359");
        podcast.setDescription("""
                Mais um episódio sobre TechGuide para vocês!
                                
                Nesta conversa, vamos falar sobre os conceitos de Clean Code, por que existem e quais são essas boas práticas, muito pedidas em entrevistas de emprego.
                """);
        podcast.setDuration("51:49");

        // Dando likes e reproduzindo
        for (int i = 0; i < 2000; i++) {
            podcast.like();
        }
        for (int i = 0; i < 4000; i++) {
            podcast.play();
        }

        // Criando "classificador"
        MyFavorites favorites = new MyFavorites();
        favorites.add(music);
        favorites.add(podcast);
    }
}