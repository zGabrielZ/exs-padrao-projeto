package br.com.gabrielferreira.futebol.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Time implements Serializable {

    private String nome;
    private String tecnico;
    private List<Jogador> jogadores = new ArrayList<>();

    public Time(String nome, String tecnico, List<Jogador> jogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = jogadores;
    }

    public Time() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return Objects.equals(nome, time.nome) && Objects.equals(tecnico, time.tecnico) && Objects.equals(jogadores, time.jogadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tecnico, jogadores);
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}
