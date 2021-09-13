package br.com.designpatterns.loja.imposto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
//		switch (tipoImposto) {
//		case ICMS:
//			return orcamento.getValor().multiply(new BigDecimal("0.1"));
//		case ISS:
//			return orcamento.getValor().multiply(new BigDecimal("0.06"));
//		default:
//			return BigDecimal.ZERO;
//		}
		
		return imposto.calcular(orcamento);
		
	}

}
