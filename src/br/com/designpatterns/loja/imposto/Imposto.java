package br.com.designpatterns.loja.imposto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	private Imposto impostoAux;
	
	public Imposto(Imposto impostoAux) {
		this.impostoAux = impostoAux;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = this.realizarCalculo(orcamento);
		BigDecimal valorImpostoAux = BigDecimal.ZERO;
		
		if(this.impostoAux != null) {
			valorImpostoAux = this.impostoAux.calcular(orcamento);
		}
		
		return valorImposto.add(valorImpostoAux);
	}

}
