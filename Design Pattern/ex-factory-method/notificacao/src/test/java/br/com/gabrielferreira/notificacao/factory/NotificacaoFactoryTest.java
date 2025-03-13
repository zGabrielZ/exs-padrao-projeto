package br.com.gabrielferreira.notificacao.factory;

import br.com.gabrielferreira.notificacao.enums.NotificacaoEnum;
import br.com.gabrielferreira.notificacao.enviarnotificacao.Notificacao;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoFactoryTest {

    private Notificacao notificacao;

    @Test
    @DisplayName("Deve gerar notificação de email")
    void deveGerarNotificacaoEmail() {
        notificacao = NotificacaoFactory.getNotificacao(NotificacaoEnum.EMAIL);

        assertTrue(notificacao.enviarNotificacao("Bem vindo ao curso de Java"));
    }

    @Test
    @DisplayName("Deve gerar notificação de sms")
    void deveGerarNotificacaoSms() {
        notificacao = NotificacaoFactory.getNotificacao(NotificacaoEnum.SMS);

        assertTrue(notificacao.enviarNotificacao("Bem vindo ao curso de HTML5"));
    }

    @Test
    @DisplayName("Deve gerar notificação de push")
    void deveGerarNotificacaoPush() {
        notificacao = NotificacaoFactory.getNotificacao(NotificacaoEnum.PUSH);

        assertTrue(notificacao.enviarNotificacao("Bem vindo ao curso de Spring Boot"));
    }
}