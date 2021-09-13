package br.com.designpatterns.loja.imposto;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcular(Orcamento orcamento);

}
