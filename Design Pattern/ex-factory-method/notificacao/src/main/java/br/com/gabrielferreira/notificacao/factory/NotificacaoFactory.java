package br.com.gabrielferreira.notificacao.factory;

import br.com.gabrielferreira.notificacao.enums.NotificacaoEnum;
import br.com.gabrielferreira.notificacao.enviarnotificacao.Notificacao;
import br.com.gabrielferreira.notificacao.enviarnotificacao.impl.Email;
import br.com.gabrielferreira.notificacao.enviarnotificacao.impl.Push;
import br.com.gabrielferreira.notificacao.enviarnotificacao.impl.SMS;

public class NotificacaoFactory {

    private NotificacaoFactory() {}

    public static Notificacao getNotificacao(NotificacaoEnum notificacao) {
        return switch (notificacao) {
            case EMAIL -> new Email();
            case SMS -> new SMS();
            case PUSH -> new Push();
        };
    }
}
