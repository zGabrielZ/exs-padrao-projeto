package br.com.gabrielferreira.esportes.template;

import br.com.gabrielferreira.esportes.model.Partida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FutebolTest {

    @Test
    void deveExecutarTemplateMethod() {
        Futebol futebol = new Futebol("Brasil", "Argentina", 2, 1);
        futebol.executar();

        assertEquals("Brasil", futebol.getNomeTimeCasa());
        assertEquals("Argentina", futebol.getNomeTimeVisitante());
        assertEquals(2, futebol.getGolsTimeCasa());
        assertEquals(1, futebol.getGolsTimeVisitante());

        Partida partida = new Partida(futebol.getPartida().getTimeCasa(), futebol.getPartida().getTimeVisitante());
        partida.setGolsTimeCasa(futebol.getGolsTimeCasa());
        partida.setGolsTimeVisitante(futebol.getGolsTimeVisitante());

        assertEquals(partida, futebol.getPartida());
    }

}