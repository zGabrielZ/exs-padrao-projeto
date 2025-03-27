package br.com.gabrielferreira.esportes.template;

import br.com.gabrielferreira.esportes.model.Partida;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TipoDeEsporte {

    public static final Logger log = LoggerFactory.getLogger(TipoDeEsporte.class);

    protected String nomeTimeCasa;
    protected String nomeTimeVisitante;
    protected Partida partida;

    protected TipoDeEsporte(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
    }

    protected abstract void iniciar();
    protected abstract void jogando();
    protected abstract void mostrarResultado();

    public String getNomeTimeCasa() {
        return nomeTimeCasa;
    }

    public String getNomeTimeVisitante() {
        return nomeTimeVisitante;
    }

    public Partida getPartida() {
        return partida;
    }

    public void executar() {
        iniciar();
        jogando();
        mostrarResultado();
    }
}
