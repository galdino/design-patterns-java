package br.com.designpatterns.loja.imposto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class ICMS extends Imposto {
	
	public ICMS(Imposto impostoAux) {
		super(impostoAux);
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
