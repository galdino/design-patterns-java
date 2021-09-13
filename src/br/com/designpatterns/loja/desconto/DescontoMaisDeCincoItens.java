package br.com.designpatterns.loja.desconto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class DescontoMaisDeCincoItens extends Desconto {
	
	public DescontoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return this.proximo.calcular(orcamento);
	}

}
