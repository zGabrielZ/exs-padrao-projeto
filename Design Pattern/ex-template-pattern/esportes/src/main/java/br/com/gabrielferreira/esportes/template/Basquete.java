package br.com.gabrielferreira.esportes.template;

import br.com.gabrielferreira.esportes.model.Partida;
import br.com.gabrielferreira.esportes.model.Time;

public class Basquete extends TipoDeEsporte {

    private final Integer placarGeralTimeCasa;
    private final Integer placarGeralTimeVisitante;

    public Basquete(String nomeTimeCasa, String nomeTimeVisitante, Integer placarGeralTimeCasa, Integer placarGeralTimeVisitante) {
        super(nomeTimeCasa, nomeTimeVisitante);
        this.placarGeralTimeCasa = placarGeralTimeCasa;
        this.placarGeralTimeVisitante = placarGeralTimeVisitante;
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
            partida.setGolsTimeCasa(this.placarGeralTimeCasa);
            partida.setGolsTimeVisitante(this.placarGeralTimeVisitante);
        }
    }

    @Override
    protected void mostrarResultado() {
        if (partida != null) {
            log.info("Resultado da partida:");
            log.info("{} {} x {} {}", partida.getTimeCasa().nome(), partida.getGolsTimeCasa(), partida.getGolsTimeVisitante(), partida.getTimeVisitante().nome());
        }
    }

    public Integer getPlacarGeralTimeCasa() {
        return placarGeralTimeCasa;
    }

    public Integer getPlacarGeralTimeVisitante() {
        return placarGeralTimeVisitante;
    }
}
