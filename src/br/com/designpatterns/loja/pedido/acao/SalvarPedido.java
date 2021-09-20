package br.com.designpatterns.loja.pedido.acao;

import br.com.designpatterns.loja.pedido.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvar pedido no Banco de Dados");
	}
	
}
