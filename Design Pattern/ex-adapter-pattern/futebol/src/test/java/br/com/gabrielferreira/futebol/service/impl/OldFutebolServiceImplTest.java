package br.com.gabrielferreira.futebol.service.impl;

import br.com.gabrielferreira.futebol.model.Jogador;
import br.com.gabrielferreira.futebol.model.Time;
import br.com.gabrielferreira.futebol.service.FutebolService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OldFutebolServiceImplTest {

    @Test
    @DisplayName("Deve criar um jogo com os times e os gols")
    void deveCriarUmJogoComTimesEGols() {
        FutebolService futebolService = new OldFutebolServiceImpl();
        var jogo = futebolService.registrarJogo(gerarTimeCasa(), gerarTimeVisitante(), 1, 3);

        assertNotNull(jogo);
        assertEquals("Flamengo", jogo.getTimeCasa().getNome());
        assertEquals("Palmeiras", jogo.getTimeVisitante().getNome());
        assertEquals(1, jogo.getGolsCasa());
        assertEquals(3, jogo.getGolsVisitante());
        assertFalse(jogo.getTimeCasa().getJogadores().isEmpty());
        assertFalse(jogo.getTimeVisitante().getJogadores().isEmpty());
    }

    private Time gerarTimeVisitante() {
        List<Jogador> jogadoresPalmeiras = new ArrayList<>();
        jogadoresPalmeiras.add(new Jogador("Weverton", "Goleiro"));
        jogadoresPalmeiras.add(new Jogador("Gustavo Gómez", "Zagueiro"));
        jogadoresPalmeiras.add(new Jogador("Raphael Veiga", "Meia"));
        return new Time("Palmeiras", "Abel Ferreira", jogadoresPalmeiras);
    }

    private Time gerarTimeCasa() {
        List<Jogador> jogadoresFlamengo = new ArrayList<>();
        jogadoresFlamengo.add(new Jogador("Gabigol", "Atacante"));
        jogadoresFlamengo.add(new Jogador("Arrascaeta", "Meia"));
        jogadoresFlamengo.add(new Jogador("Bruno Henrique", "Atacante"));
        return new Time("Flamengo", "Jorge Jesus", jogadoresFlamengo);
    }

}