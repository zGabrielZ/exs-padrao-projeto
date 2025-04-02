package br.com.gabrielferreira.futebol.service.impl;

import br.com.gabrielferreira.futebol.model.Jogo;
import br.com.gabrielferreira.futebol.model.Time;
import br.com.gabrielferreira.futebol.service.FutebolService;

public class OldFutebolServiceImpl implements FutebolService {

    @Override
    public Jogo registrarJogo(Time timeCasa, Time timeVisitante, int golsTimeCasa, int golsTimeVisitante) {
        Jogo jogo = new Jogo();
        jogo.setTimeCasa(timeCasa);
        jogo.setTimeVisitante(timeVisitante);
        jogo.setGolsCasa(golsTimeCasa);
        jogo.setGolsVisitante(golsTimeVisitante);
        return jogo;
    }
}
