package br.com.gabrielferreira.notificacao.enviarnotificacao.impl;

import br.com.gabrielferreira.notificacao.enviarnotificacao.Notificacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Push implements Notificacao {

    private static final Logger logger = LoggerFactory.getLogger(Push.class);

    @Override
    public boolean enviarNotificacao(String mensagem) {
        logger.info("Enviando Push: {}", mensagem);
        return true;
    }
}
