package br.com.gabrielferreira.email.enviaremail.impl;

import br.com.gabrielferreira.email.enviaremail.EnviadorEmail;
import br.com.gabrielferreira.email.model.Contato;
import br.com.gabrielferreira.email.xml.ContatoXML;

import java.util.ArrayList;
import java.util.List;

import static br.com.gabrielferreira.email.util.LoggerUtil.info;

public class EnviadorEmailProxyImpl implements EnviadorEmail {

    private final List<Contato> contatos;
    private List<String> emailsNotBlackList = new ArrayList<>();

    public EnviadorEmailProxyImpl(String... nomesArquivos) {
        ContatoXML contatoXML = new ContatoXML(nomesArquivos);
        this.contatos = contatoXML.getContatos();
    }

    @Override
    public void enviar(String mensagem) {
        filtrarEmailsValidos().forEach(email -> {
            info("Enviando a mensagem " + mensagem + " para o e-mail " + email);
            info("Enviando email......");
            info("Enviado");
        });
    }

    private List<String> filtrarEmailsValidos() {
        emailsNotBlackList = this.contatos
                .stream()
                .filter(contato -> !contato.blackList())
                .map(Contato::email)
                .toList();
        return emailsNotBlackList;
    }

    public List<String> getEmailsNotBlackList() {
        return emailsNotBlackList;
    }
}
