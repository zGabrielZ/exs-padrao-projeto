package br.com.gabrielferreira.log.factory.impl;

import br.com.gabrielferreira.log.factory.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFactoryImplLogger implements LogFactory {

    private static final Logger logger = LoggerFactory.getLogger(LogFactoryImplLogger.class);

    @Override
    public void log(String mensagem) {
        logger.info("Mensagem => {}", mensagem);
    }
}
