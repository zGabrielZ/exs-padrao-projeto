package br.com.gabrielferreira.futebol.service.impl;

import br.com.gabrielferreira.futebol.model.Jogo;
import br.com.gabrielferreira.futebol.model.Time;
import br.com.gabrielferreira.futebol.service.NewFutebolService;

import java.util.ArrayList;

public class NewFutebolServiceImpl implements NewFutebolService {

    @Override
    public Jogo registrarJogo(String nomeTimeCasa, String nomeTimeVisitante, int golsTimeCasa, int golsTimeVisitante) {
        return new Jogo(getTime(nomeTimeCasa), getTime(nomeTimeVisitante), golsTimeCasa, golsTimeVisitante);
    }

    private Time getTime(String nomeTime) {
        return new Time(nomeTime, null, new ArrayList<>());
    }
}
