package br.com.gabrielferreira.dao;

import br.com.gabrielferreira.model.Contato;

import java.util.UUID;

public interface AgendaDAO {

    void inserir(Contato contato);

    Contato buscar(UUID codigo);
}
