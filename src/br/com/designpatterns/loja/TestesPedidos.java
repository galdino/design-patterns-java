package br.com.designpatterns.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.designpatterns.loja.pedido.GeraPedido;
import br.com.designpatterns.loja.pedido.GeraPedidoHandler;
import br.com.designpatterns.loja.pedido.acao.EnviarEmailPedido;
import br.com.designpatterns.loja.pedido.acao.SalvarPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Bob";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarPedido(), new EnviarEmailPedido()));
		geraPedidoHandler.execute(geraPedido);
	}

}
