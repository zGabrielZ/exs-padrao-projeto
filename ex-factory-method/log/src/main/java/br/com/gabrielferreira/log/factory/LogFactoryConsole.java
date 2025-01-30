package br.com.gabrielferreira.log.factory;

public class LogFactoryConsole implements LogFactory {

    @Override
    public void log(String mensagem) {
        System.out.println(mensagem);
    }
}
