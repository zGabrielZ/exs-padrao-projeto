package br.com.gabrielferreira.futebol.main;

import br.com.gabrielferreira.futebol.adapter.FutebolAdapter;
import br.com.gabrielferreira.futebol.model.Jogador;
import br.com.gabrielferreira.futebol.model.Jogo;
import br.com.gabrielferreira.futebol.model.Time;
import br.com.gabrielferreira.futebol.service.FutebolService;
import br.com.gabrielferreira.futebol.service.impl.NewFutebolServiceImpl;
import br.com.gabrielferreira.futebol.service.impl.OldFutebolServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        FutebolService oldFutService = new OldFutebolServiceImpl();
        List<Jogador> jogadoresFlamengo = new ArrayList<>();
        jogadoresFlamengo.add(new Jogador("Gabigol", "Atacante"));
        jogadoresFlamengo.add(new Jogador("Arrascaeta", "Meia"));
        jogadoresFlamengo.add(new Jogador("Bruno Henrique", "Atacante"));


        List<Jogador> jogadoresPalmeiras = new ArrayList<>();
        jogadoresPalmeiras.add(new Jogador("Weverton", "Goleiro"));
        jogadoresPalmeiras.add(new Jogador("Gustavo Gómez", "Zagueiro"));
        jogadoresPalmeiras.add(new Jogador("Raphael Veiga", "Meia"));

        Time time1 = new Time("Flamengo", "Jorge Jesus", jogadoresFlamengo);
        Time time2 = new Time("Palmeiras", "Abel Ferreira", jogadoresPalmeiras);

        Jogo jogo = oldFutService.registrarJogo(time1, time2, 1, 3);
        System.out.println(jogo);

        FutebolAdapter futebolAdapter = new FutebolAdapter(new NewFutebolServiceImpl());
        jogo = futebolAdapter.registrarJogo(time1, time2, 1, 3);
        System.out.println(jogo);
    }
}
