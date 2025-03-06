package br.com.gabrielferreira.service;

import br.com.gabrielferreira.model.Contato;

import java.util.UUID;

public interface AgendaService {

    void inserir(Contato contato);

    Contato buscar(UUID codigo);
}
