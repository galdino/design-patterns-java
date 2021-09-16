package br.com.designpatterns.loja.orcamento.situacao;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
	
	

}
