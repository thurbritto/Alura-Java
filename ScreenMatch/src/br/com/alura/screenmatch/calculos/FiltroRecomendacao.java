package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("É um dos preferidos!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Bem avaliado.");
        } else {
            System.out.println("Não agradou muito.");
        }
    }
}
