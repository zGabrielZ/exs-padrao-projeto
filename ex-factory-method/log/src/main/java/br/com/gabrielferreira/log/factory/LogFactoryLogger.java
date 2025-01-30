package br.com.gabrielferreira.log.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFactoryLogger implements LogFactory {

    private static final Logger logger = LoggerFactory.getLogger(LogFactoryLogger.class);

    @Override
    public void log(String mensagem) {
        logger.info("Mensagem => {}", mensagem);
    }
}
