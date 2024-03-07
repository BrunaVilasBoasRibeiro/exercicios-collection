package br.fai.lds.ex03;

import br.fai.lds.ex03.models.Cachorro;
import br.fai.lds.ex03.models.Gato;
import br.fai.lds.ex03.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {
        Exercicio03 app = new Exercicio03();
        app.start();
    }

    private void start() {
//        Gato primeiroGato = new Gato();
//        Cachorro cachorro = new Cachorro();
//
//        Cachorro segundoCachorro =new Cachorro("Tibursinho");
//        System.out.println("Nome do segundo cachorro:" + segundoCachorro);

//        Cachorro cachorro = new Cachorro("Doguinho");
//        cachorro.som();
//        cachorro.oQueGostoDeFazer();
//
//        Gato gato = new Gato();
//        gato.som();

        Cachorro primeiroCachorro = new Cachorro("Tiburso");
        Cachorro segundoCachorro = new Cachorro("Aroldo");
        primeiroCachorro.setCor("azul");

        List <Cachorro> cachorros = new ArrayList<>();
        cachorros.add(primeiroCachorro);
        cachorros.add(segundoCachorro);

        for (Cachorro cachorro : cachorros){
            System.out.println("Nome do cachorro: " + cachorro.getNome());
            System.out.println("Cor do cachorro: " + cachorro.getCor());
            System.out.println("Idade do cachorro: " + cachorro.getIdade());

            cachorro.som();
            cachorro.oQueGostoDeFazer();
            cachorro.dizerMeuNome();

            System.out.println("------------------------------------------------------");

        }
        Gato primeiroGato = new Gato();
        Gato segundoGato = new Gato("amarelo");

        List<Gato> gatos = new ArrayList<>();
        gatos.add(primeiroGato);
        gatos.add(segundoGato);
        for (int i = 0; i < gatos.size(); i++){
            Gato gato = gatos.get(i);
            System.out.println("Nome do Gato: " + gato.getNome());
            System.out.println("Nome do Gato: " + gato.getIdade());
            System.out.println("Nome do Gato: " + gato.getCor());

            gato.som();
            gato.dizerMeuNome();
            gato.oQueFacoDuranteANoite();
        }

    }
}
