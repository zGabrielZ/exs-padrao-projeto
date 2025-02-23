package br.com.gabrielferreira.email.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

    private static final Logger logger = LoggerFactory.getLogger(LoggerUtil.class);

    public LoggerUtil() {}

    public static void info(String mensagem) {
        logger.info(mensagem);
    }
}
