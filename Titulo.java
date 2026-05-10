package br.com.Carlos.ScreeanMatch.Modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMInutos;
    private double nota;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMInutos() {
        return duracaoEmMInutos;
    }

    public void setDuracaoEmMInutos(int duracaoEmMInutos) {
        this.duracaoEmMInutos = duracaoEmMInutos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getSomaDasAvaliacoes() {
        return this.somaDasAvaliacoes;
    }


    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }


    public void exibirFichaTecnica() {

        System.out.println("Nome:" + getNome());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Duracao em minutos" + getDuracaoEmMInutos());
        System.out.println("Nota: " + getNota());
    }



    public void avalia(double nota) {
         this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }


    public double pegaMedia () {
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }


}
