package br.com.gabrielferreira.esportes.template;

import br.com.gabrielferreira.esportes.model.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasqueteTest {

    @Test
    void deveExecutarTemplateMethod() {
        Basquete basquete = new Basquete("Flamengo", "Vasco", 100, 90);
        basquete.executar();

        assertEquals("Flamengo", basquete.getNomeTimeCasa());
        assertEquals("Vasco", basquete.getNomeTimeVisitante());
        assertEquals(100, basquete.getPlacarGeralTimeCasa());
        assertEquals(90, basquete.getPlacarGeralTimeVisitante());

        Partida partida = new Partida(basquete.getPartida().getTimeCasa(), basquete.getPartida().getTimeVisitante());
        partida.setGolsTimeCasa(basquete.getPlacarGeralTimeCasa());
        partida.setGolsTimeVisitante(basquete.getPlacarGeralTimeVisitante());

        assertEquals(partida, basquete.getPartida());
    }

}