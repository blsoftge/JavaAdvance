package br.com.blsoft.javaadvance.video25.moeda;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Moeda {
    
    private BigDecimal valor;
    private static final String UNIDADE_MONETARIA = "R$";
    private static final DecimalFormat FORMATO = new DecimalFormat(UNIDADE_MONETARIA + " #,###,##0.00");

    public Moeda(BigDecimal valor) {
        this.valor = valor;
    }

    public Moeda(String valor) {
        this.valor = new BigDecimal(valor);
    }

    public void somarCom(BigDecimal valor) {
        this.valor = this.valor.add(valor);
    }

    public void subtrair(BigDecimal valor) {
        this.valor = this.valor.subtract(valor);
    }

    public void multiplicarPor(BigDecimal valor) {
        this.valor = this.valor.multiply(valor);
    }

    public void dividirPor(BigDecimal valor) throws Exception {
        if (valor.compareTo(BigDecimal.ZERO) == 0) {
            throw new Exception("Ops! Erro ao dividir " + this.valor + " por " + valor);
        } else {
            this.valor = this.valor.divide(valor);
        }
    }

    public String getValorFormatado() {
        return FORMATO.format(this.valor);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
