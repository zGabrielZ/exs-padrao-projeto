package br.com.gabrielferreira.notificacao.enviarnotificacao.impl;

import br.com.gabrielferreira.notificacao.enviarnotificacao.Notificacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Email implements Notificacao {

    private static final Logger logger = LoggerFactory.getLogger(Email.class);

    @Override
    public boolean enviarNotificacao(String mensagem) {
        logger.info("Enviando e-mail: {}", mensagem);
        return true;
    }
}
