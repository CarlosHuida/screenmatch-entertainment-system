package br.com.Carlos.ScreeanMatch.Modelos;

public class Filme extends Titulo implements Classificavel{

    private String diretor;

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Diretor:" + diretor);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
