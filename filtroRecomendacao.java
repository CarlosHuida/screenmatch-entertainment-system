package br.com.Carlos.ScreeanMatch.Modelos;

public class filtroRecomendacao   {



    void filtro(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        } else
            System.out.println("Lembrar de assistir mais depois");

    }
}



