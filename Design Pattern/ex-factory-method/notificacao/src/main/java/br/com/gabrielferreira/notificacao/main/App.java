package br.com.gabrielferreira.notificacao.main;

import br.com.gabrielferreira.notificacao.enums.NotificacaoEnum;
import br.com.gabrielferreira.notificacao.enviarnotificacao.Notificacao;
import br.com.gabrielferreira.notificacao.factory.NotificacaoFactory;

public class App {

    public static void main(String[] args) {
        Notificacao notificacao = NotificacaoFactory.getNotificacao(NotificacaoEnum.EMAIL);
        notificacao.enviarNotificacao("Bem vindo ao curso de Java");

        notificacao = NotificacaoFactory.getNotificacao(NotificacaoEnum.SMS);
        notificacao.enviarNotificacao("Bem vindo ao curso de HTML5");

        notificacao = NotificacaoFactory.getNotificacao(NotificacaoEnum.PUSH);
        notificacao.enviarNotificacao("Bem vindo ao curso de Spring boot");
    }
}
