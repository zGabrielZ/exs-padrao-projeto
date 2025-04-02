package br.com.gabrielferreira.futebol.service;

import br.com.gabrielferreira.futebol.model.Jogo;

public interface NewFutebolService {

    Jogo registrarJogo(String nomeTimeCasa, String nomeTimeVisitante, int golsTimeCasa, int golsTimeVisitante);
}
