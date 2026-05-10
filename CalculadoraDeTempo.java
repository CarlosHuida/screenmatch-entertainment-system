package br.com.Carlos.ScreeanMatch.Modelos;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }
    public void inclui (Filme filme){
        tempoTotal += filme.getDuracaoEmMInutos();
    }
}

