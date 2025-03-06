package br.com.gabrielferreira.filmes.model.enums;

public enum TipoFilme {
    ANTIGO("Antigo"),
    NOVO("Novo");

    private String descricao;

    TipoFilme(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
