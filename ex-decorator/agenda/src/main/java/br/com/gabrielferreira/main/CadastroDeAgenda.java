package br.com.gabrielferreira.main;

import br.com.gabrielferreira.dao.impl.AgendaDAOImpl;
import br.com.gabrielferreira.model.Contato;
import br.com.gabrielferreira.service.AgendaService;
import br.com.gabrielferreira.service.impl.AgendaServiceImpl;

public class CadastroDeAgenda {

    public static void main(String[] args) {
        AgendaService agendaService = new AgendaServiceImpl(new AgendaDAOImpl());

        Contato contato = new Contato(null, "José da Silva", "9999-9999");
        agendaService.inserir(contato);

        contato = new Contato(null, "Maria da Silva", "8888-8888");
        agendaService.inserir(contato);

        contato = new Contato(null, "João da Silva", "7777-7777");
        agendaService.inserir(contato);
    }
}
