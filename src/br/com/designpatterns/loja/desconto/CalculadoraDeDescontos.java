package br.com.designpatterns.loja.desconto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisDeCincoItens(
						    	new DescontoValorMaiorQuinhentos(
						    			new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
