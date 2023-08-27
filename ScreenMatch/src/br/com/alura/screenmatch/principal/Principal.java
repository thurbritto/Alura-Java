package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando objetos para testar funcionalidades.
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        var filme = new Filme("Elementos", 2023);
        filme.setDuracaoEmMinutos(102);
        filme.setIncluidoNoPlano(false);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(80);

        // Teste da calculadora de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        // Teste do filtro de recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        favorito.avalia(10);
        favorito.avalia(8);
        outro.avalia(6);
        outro.avalia(2);
        filme.avalia(9);
        filme.avalia(9);

        filtro.filtrar(favorito);
        filtro.filtrar(outro);
        filtro.filtrar(filme);
        filtro.filtrar(primeiro);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(favorito);
        filmes.add(outro);
        filmes.add(filme);
        System.out.println("\nTamanho da lista: " + filmes.size());
        System.out.println("Primeiro filme da lista: " + filmes.get(0));
        System.out.println(filmes);




    }
}
