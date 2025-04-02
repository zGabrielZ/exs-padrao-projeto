package br.com.gabrielferreira.futebol.adapter;

import br.com.gabrielferreira.futebol.model.Jogo;
import br.com.gabrielferreira.futebol.model.Time;
import br.com.gabrielferreira.futebol.service.FutebolService;
import br.com.gabrielferreira.futebol.service.NewFutebolService;

public class FutebolAdapter implements FutebolService {

    private final NewFutebolService newFutebolService;

    public FutebolAdapter(NewFutebolService newFutebolService) {
        this.newFutebolService = newFutebolService;
    }

    @Override
    public Jogo registrarJogo(Time timeCasa, Time timeVisitante, int golsTimeCasa, int golsTimeVisitante) {
        return newFutebolService.registrarJogo(timeCasa.getNome(), timeVisitante.getNome(), golsTimeCasa, golsTimeVisitante);
    }
}
