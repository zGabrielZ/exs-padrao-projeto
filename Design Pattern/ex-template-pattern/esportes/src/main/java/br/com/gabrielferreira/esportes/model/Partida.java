package br.com.gabrielferreira.esportes.model;

import java.io.Serializable;
import java.util.Objects;

public class Partida implements Serializable {

    private Time timeCasa;
    private Time timeVisitante;
    private Integer golsTimeCasa;
    private Integer golsTimeVisitante;

    public Partida(Time timeCasa, Time timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    public Partida() {}

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

    public Integer getGolsTimeCasa() {
        return golsTimeCasa;
    }

    public void setGolsTimeCasa(Integer golsTimeCasa) {
        this.golsTimeCasa = golsTimeCasa;
    }

    public Integer getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(Integer golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partida partida = (Partida) o;
        return Objects.equals(timeCasa, partida.timeCasa) && Objects.equals(timeVisitante, partida.timeVisitante) && Objects.equals(golsTimeCasa, partida.golsTimeCasa) && Objects.equals(golsTimeVisitante, partida.golsTimeVisitante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeCasa, timeVisitante, golsTimeCasa, golsTimeVisitante);
    }
}
