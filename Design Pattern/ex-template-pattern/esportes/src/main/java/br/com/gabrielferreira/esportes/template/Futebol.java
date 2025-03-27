package br.com.gabrielferreira.esportes.template;

import br.com.gabrielferreira.esportes.model.Partida;
import br.com.gabrielferreira.esportes.model.Time;

public class Futebol extends TipoDeEsporte {

    private final Integer golsTimeCasa;
    private final Integer golsTimeVisitante;

    public Futebol(String nomeTimeCasa, String nomeTimeVisitante, Integer golsTimeCasa, Integer golsTimeVisitante) {
        super(nomeTimeCasa, nomeTimeVisitante);
        this.golsTimeCasa = golsTimeCasa;
        this.golsTimeVisitante = golsTimeVisitante;
    }

    @Override
    protected void iniciar() {
        Time timeCasa = new Time(this.nomeTimeCasa);
        Time timeVisitante = new Time(this.nomeTimeVisitante);

        partida = new Partida(timeCasa, timeVisitante);
    }

    @Override
    protected void jogando() {
        if (partida != null) {
            partida.setGolsTimeCasa(this.golsTimeCasa);
            partida.setGolsTimeVisitante(this.golsTimeVisitante);
        }
    }

    @Override
    protected void mostrarResultado() {
        if (partida != null) {
            log.info("Resultado da partida:");
            log.info("{} {} x {} {}", partida.getTimeCasa().nome(), partida.getGolsTimeCasa(), partida.getGolsTimeVisitante(), partida.getTimeVisitante().nome());
        }
    }

    public Integer getGolsTimeCasa() {
        return golsTimeCasa;
    }

    public Integer getGolsTimeVisitante() {
        return golsTimeVisitante;
    }
}
