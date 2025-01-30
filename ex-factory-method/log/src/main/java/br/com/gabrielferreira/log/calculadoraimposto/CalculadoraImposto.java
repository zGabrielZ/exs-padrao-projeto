package br.com.gabrielferreira.log.calculadoraimposto;

import br.com.gabrielferreira.log.factory.LogFactory;

import java.math.BigDecimal;

public abstract class CalculadoraImposto {

    private BigDecimal valorCalculadoAposImposto;

    public BigDecimal getValorCalculadoAposImposto() {
        return valorCalculadoAposImposto;
    }

    protected abstract LogFactory criarLog();

    public void calcular(BigDecimal valor) {
        BigDecimal valorImpostoCalculado = valor.multiply(BigDecimal.valueOf(0.10));
        BigDecimal valorCalculado = valor.subtract(valorImpostoCalculado);
        criarLog().log("Imposto calculado para o valor R$ " + valorCalculado);
        this.valorCalculadoAposImposto = valorCalculado;
    }
}
