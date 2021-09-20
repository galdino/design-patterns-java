package br.com.designpatterns.loja.pedido;

import java.time.LocalDateTime;

import br.com.designpatterns.loja.orcamento.Orcamento;
import br.com.designpatterns.loja.pedido.acao.EnviarEmailPedido;
import br.com.designpatterns.loja.pedido.acao.SalvarPedido;

public class GeraPedidoHandler {
	
	//construtor com injecao de dependencias: repository, service, etc...
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
		SalvarPedido salvarPedido = new SalvarPedido();
		
		enviarEmailPedido.executar();
		salvarPedido.executar();
				
	}

}
