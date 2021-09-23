package br.com.designpatterns.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.designpatterns.loja.orcamento.ItemOrcamento;
import br.com.designpatterns.loja.orcamento.Orcamento;
import br.com.designpatterns.loja.pedido.GeraPedido;
import br.com.designpatterns.loja.pedido.GeraPedidoHandler;
import br.com.designpatterns.loja.pedido.acao.EnviarEmailPedido;
import br.com.designpatterns.loja.pedido.acao.SalvarPedido;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Bob";
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("150")));
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("150")));
		
		GeraPedido geraPedido = new GeraPedido(cliente, orcamento);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarPedido(), new EnviarEmailPedido()));
		geraPedidoHandler.execute(geraPedido);
	}

}
