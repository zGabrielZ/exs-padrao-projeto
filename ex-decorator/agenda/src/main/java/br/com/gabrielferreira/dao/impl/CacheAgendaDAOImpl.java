package br.com.gabrielferreira.dao.impl;

import br.com.gabrielferreira.dao.AgendaDAO;
import br.com.gabrielferreira.model.Contato;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CacheAgendaDAOImpl implements AgendaDAO {

    private static final Map<UUID, Contato> contatosEmCache = new HashMap<>();
    private final AgendaDAO agendaDAO;

    public CacheAgendaDAOImpl(AgendaDAO agendaDAO) {
        this.agendaDAO = agendaDAO;
    }

    @Override
    public void inserir(Contato contato) {
        agendaDAO.inserir(contato);
        contatosEmCache.put(contato.getCodigo(), contato);
    }

    @Override
    public Contato buscar(UUID codigo) {
        return contatosEmCache.get(codigo);
    }
}
