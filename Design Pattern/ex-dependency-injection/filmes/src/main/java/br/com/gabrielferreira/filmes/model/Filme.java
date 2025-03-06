package br.com.gabrielferreira.filmes.model;

import br.com.gabrielferreira.filmes.model.enums.TipoFilme;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Filme implements Serializable {

    @Serial
    private static final long serialVersionUID = -501198941932364119L;

    private String titulo;

    private LocalDate dataLancamento;

    private TipoFilme tipoFilme;

    public Filme() {}

    public Filme(String titulo, LocalDate dataLancamento, TipoFilme tipoFilme) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.tipoFilme = tipoFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(TipoFilme tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", tipoFilme=" + tipoFilme +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(titulo, filme.titulo) && Objects.equals(dataLancamento, filme.dataLancamento) && tipoFilme == filme.tipoFilme;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, dataLancamento, tipoFilme);
    }
}
