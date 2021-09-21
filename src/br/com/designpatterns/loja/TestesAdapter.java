package br.com.designpatterns.loja;

import java.math.BigDecimal;

import br.com.designpatterns.loja.http.JavaHttpClient;
import br.com.designpatterns.loja.orcamento.Orcamento;
import br.com.designpatterns.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
		registroDeOrcamento.registrar(orcamento);
		

	}

}
