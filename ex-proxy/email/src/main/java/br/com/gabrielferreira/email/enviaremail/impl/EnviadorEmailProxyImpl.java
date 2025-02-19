package br.com.gabrielferreira.email.enviaremail.impl;

import br.com.gabrielferreira.email.enviaremail.EnviadorEmail;
import br.com.gabrielferreira.email.model.Contato;
import br.com.gabrielferreira.email.xml.ContatoXML;

import java.util.ArrayList;
import java.util.List;

public class EnviadorEmailProxyImpl implements EnviadorEmail {

    private final ContatoXML contatoXML;
    private List<String> emailsNotBlackList = new ArrayList<>();

    public EnviadorEmailProxyImpl(String... nomesArquivos) {
        this.contatoXML = new ContatoXML(nomesArquivos);
    }

    @Override
    public void enviar(String mensagem) {
        filtrarEmailsValidos().forEach(email -> {
            System.out.println("Enviando a mensagem " + mensagem + " para o e-mail " + email);
            System.out.println("Enviando email......");
            System.out.println("Enviado");
        });
    }

    private List<String> filtrarEmailsValidos() {
        emailsNotBlackList = new ArrayList<>();
        if (contatoXML.existeContatos(contatoXML.getContatoList())) {
            emailsNotBlackList = contatoXML.getContatoList().getContatos()
                    .stream()
                    .filter(contato -> !contato.isBlackList())
                    .map(Contato::getEmail)
                    .toList();
        }
        return emailsNotBlackList;
    }

    public List<String> getEmailsNotBlackList() {
        return emailsNotBlackList;
    }
}
