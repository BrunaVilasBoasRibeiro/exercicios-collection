package br.fai.lds.ex03.models;

public abstract class Animal {
    private int id;
    private String nome = "Não definido";
    private int idade = 5;
    private  String cor = "preto";

    public void som (){
        System.out.println("Este é o som padrão de um animal = zzzz");
    }
    public void  dizerMeuNome (){
        System.out.println("Nome do animal: xxx");
    }
    private void dizerMinhaIdade (){
        System.out.println("Minha idade é: xx");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
