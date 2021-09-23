package br.com.designpatterns.loja;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.ItemOrcamento;
import br.com.designpatterns.loja.orcamento.Orcamento;
import br.com.designpatterns.loja.orcamento.OrcamentoProxy;

public class TestesComposicao {
	
	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo);
		
		OrcamentoProxy orcamentoProxy = new OrcamentoProxy(novo);
		
		System.out.println(orcamentoProxy.getValor());
		System.out.println(orcamentoProxy.getValor());
	}

}
