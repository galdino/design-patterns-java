package br.com.designpatterns.loja.pedido.acao;

import br.com.designpatterns.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviar email com dados do novo pedido");
	}
	
}
