package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(10);
        var filmeAleatorio = new Filme("Elementos", 2023);
        filmeAleatorio.avalia(10);
        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(filmeAleatorio);
        lista.add(serie);
        for (Titulo titulo : lista) {
            System.out.println("Nome: " + titulo.getNome());
            if (titulo instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        System.out.println("\nLista ordenada por nome: ");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("\nLista ordenada por data de lançamento: ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
