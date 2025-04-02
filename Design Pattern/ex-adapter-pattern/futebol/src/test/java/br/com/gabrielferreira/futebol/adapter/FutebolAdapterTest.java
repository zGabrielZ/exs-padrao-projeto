package br.com.gabrielferreira.futebol.adapter;

import br.com.gabrielferreira.futebol.model.Time;
import br.com.gabrielferreira.futebol.service.impl.NewFutebolServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FutebolAdapterTest {

    @Test
    @DisplayName("Deve criar um jogo com os times e os gols")
    void deveCriarUmJogoComTimesEGols() {
        FutebolAdapter futebolAdapter = new FutebolAdapter(new NewFutebolServiceImpl());

        var jogo = futebolAdapter.registrarJogo(gerarTimeCasa(), gerarTimeVisitante(), 1, 3);

        assertNotNull(jogo);
        assertEquals("Flamengo", jogo.getTimeCasa().getNome());
        assertEquals("Palmeiras", jogo.getTimeVisitante().getNome());
        assertEquals(1, jogo.getGolsCasa());
        assertEquals(3, jogo.getGolsVisitante());
        assertTrue(jogo.getTimeCasa().getJogadores().isEmpty());
        assertTrue(jogo.getTimeVisitante().getJogadores().isEmpty());
        assertNull(jogo.getTimeCasa().getTecnico());
        assertNull(jogo.getTimeVisitante().getTecnico());
    }

    private Time gerarTimeVisitante() {
        return new Time("Palmeiras", null, null);
    }

    private Time gerarTimeCasa() {
        return new Time("Flamengo", null, null);
    }

}