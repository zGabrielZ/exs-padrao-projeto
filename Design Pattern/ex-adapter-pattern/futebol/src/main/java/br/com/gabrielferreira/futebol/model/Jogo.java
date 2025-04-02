package br.com.gabrielferreira.futebol.model;

import java.io.Serializable;
import java.util.Objects;

public class Jogo implements Serializable {

    private Time timeCasa;
    private Time timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public Jogo(Time timeCasa, Time timeVisitante, int golsCasa, int golsVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
    }

    public Jogo() {}

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public void setGolsCasa(int golsCasa) {
        this.golsCasa = golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return golsCasa == jogo.golsCasa && golsVisitante == jogo.golsVisitante && Objects.equals(timeCasa, jogo.timeCasa) && Objects.equals(timeVisitante, jogo.timeVisitante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeCasa, timeVisitante, golsCasa, golsVisitante);
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "timeCasa=" + timeCasa +
                ", timeVisitante=" + timeVisitante +
                ", golsCasa=" + golsCasa +
                ", golsVisitante=" + golsVisitante +
                '}';
    }
}
