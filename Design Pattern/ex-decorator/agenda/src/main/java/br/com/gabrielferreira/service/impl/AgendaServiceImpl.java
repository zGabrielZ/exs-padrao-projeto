package br.com.gabrielferreira.service.impl;

import br.com.gabrielferreira.dao.AgendaDAO;
import br.com.gabrielferreira.model.Contato;
import br.com.gabrielferreira.service.AgendaService;

import java.util.UUID;

public class AgendaServiceImpl implements AgendaService {

    private final AgendaDAO agendaDAO;

    public AgendaServiceImpl(AgendaDAO agendaDAO) {
        this.agendaDAO = agendaDAO;
    }

    @Override
    public void inserir(Contato contato) {
        agendaDAO.inserir(contato);
    }

    @Override
    public Contato buscar(UUID codigo) {
        return agendaDAO.buscar(codigo);
    }
}
