package br.com.designpatterns.loja;

import java.math.BigDecimal;

import br.com.designpatterns.loja.pedido.GeraPedido;
import br.com.designpatterns.loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(/*dependencias*/);
		geraPedidoHandler.execute(geraPedido);
	}

}
