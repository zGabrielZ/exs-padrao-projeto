package br.com.gabrielferreira.futebol.service;

import br.com.gabrielferreira.futebol.model.Jogo;
import br.com.gabrielferreira.futebol.model.Time;

public interface FutebolService {

    Jogo registrarJogo(Time timeCasa, Time timeVisitante, int golsTimeCasa, int golsTimeVisitante);
}
