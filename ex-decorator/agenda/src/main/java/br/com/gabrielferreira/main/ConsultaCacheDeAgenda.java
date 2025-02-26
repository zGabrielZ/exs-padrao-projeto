package br.com.gabrielferreira.main;

import br.com.gabrielferreira.dao.impl.AgendaDAOImpl;
import br.com.gabrielferreira.dao.impl.CacheAgendaDAOImpl;
import br.com.gabrielferreira.model.Contato;
import br.com.gabrielferreira.service.AgendaService;
import br.com.gabrielferreira.service.impl.AgendaServiceImpl;

public class ConsultaCacheDeAgenda {

    public static void main(String[] args) {
        AgendaService agendaService = new AgendaServiceImpl(new CacheAgendaDAOImpl(new AgendaDAOImpl()));

        Contato contato = new Contato(null, "José da Silva", "9999-9999");
        agendaService.inserir(contato);

        Contato contatoEncontrado = agendaService.buscar(contato.getCodigo());
        System.out.println(contatoEncontrado);
    }
}
