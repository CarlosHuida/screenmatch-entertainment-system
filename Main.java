package br.com.Carlos.ScreeanMatch.Modelos;

import br.com.Carlos.ScreeanMatch.Calculos.CalculadoraDeTempo;

public class Main extends Titulo {


    static void main(String[] args) {

        filtroRecomendacao filtro = new filtroRecomendacao();

        Filme filme = new Filme();
        filme.setNome("O poderoso Chefao");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMInutos(179);
        filme.setDiretor("Coppola");
        filme.setNota(10);

        filme.exibirFichaTecnica();
        filme.avalia(10);
        filme.avalia(9);
        filme.avalia(8);
        System.out.println("A media do filme e :" + filme.pegaMedia());
        filtro.filtro(filme);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Serie serie = new Serie();
        serie.setNome("Breaking Bad");
        serie.setAnoDeLancamento(2009);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(60);
        serie.setNota(10);
        serie.avalia(10);
        serie.avalia(9);
        serie.avalia(8);
        serie.exibirFichaTecnica();
        System.out.println(serie.pegaMedia());
        System.out.println("Duracao em minutos :" + serie.getDuracaoEmMInutos());
        filtro.filtro(serie);


        Jogo jogo = new Jogo();
        jogo.setNome("Silent Hill 2 Remake");
        jogo.setPlataforma("PS5 e PC");
        jogo.setGenero("Survival Horror");
        jogo.avalia(9);
        jogo.avalia(8);
        jogo.avalia(7);
        jogo.exibirFichaTecnica();
        System.out.println("A media e:" + jogo.pegaMedia());
        filtro.filtro(jogo);


    }
}
