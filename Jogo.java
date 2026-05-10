package br.com.Carlos.ScreeanMatch.Modelos;

public class Jogo extends Titulo implements Classificavel{
    private String plataforma;
    private String genero;

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("Nome:" + getNome());
        System.out.println("Plataformas:" + getPlataforma());
        System.out.println("Genero:" + getGenero());
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia();
    }
}
