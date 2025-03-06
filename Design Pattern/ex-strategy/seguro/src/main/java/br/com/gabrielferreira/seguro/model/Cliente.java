package br.com.gabrielferreira.seguro.model;

import br.com.gabrielferreira.seguro.model.enums.Sexo;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Cliente implements Serializable {

    @Serial
    private static final long serialVersionUID = -4196198320888219149L;

    private String nome;

    private LocalDate dataNascimento;

    private Sexo sexo;

    private BigDecimal valorSeguro;

    public Cliente() {}

    public Cliente(String nome, LocalDate dataNascimento, Sexo sexo, BigDecimal valorSeguro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.valorSeguro = valorSeguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                ", valorSeguro=" + valorSeguro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(dataNascimento, cliente.dataNascimento) && sexo == cliente.sexo && Objects.equals(valorSeguro, cliente.valorSeguro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento, sexo, valorSeguro);
    }
}
