package br.com.gabrielferreira.main;

import br.com.gabrielferreira.dao.impl.AgendaDAOImpl;
import br.com.gabrielferreira.dao.impl.CacheAgendaDAOImpl;
import br.com.gabrielferreira.model.Contato;
import br.com.gabrielferreira.service.AgendaService;
import br.com.gabrielferreira.service.impl.AgendaServiceImpl;

import java.io.File;

public class ConsultaCacheDeAgenda {

    private static final String CAMINHO_COMPLETO = System.getProperty("user.home") + "/Downloads/".concat("agenda.txt");

    public static void main(String[] args) {
        AgendaService agendaService = new AgendaServiceImpl(new CacheAgendaDAOImpl(new AgendaDAOImpl()));

        Contato contato = new Contato(null, "José da Silva", "9999-9999");
        agendaService.inserir(contato);

        System.out.println("Buscando contato por código " + contato.getCodigo());
        Contato contatoEncontrado = agendaService.buscar(contato.getCodigo());
        System.out.println(contatoEncontrado);

        System.out.println("Deletando arquivo agenda.txt");
        File file = new File(CAMINHO_COMPLETO);
        boolean delete = file.delete();
        System.out.println("Arquivo deletado? " + delete);
    }
}
