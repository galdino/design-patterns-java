package br.com.designpatterns.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.designpatterns.loja.orcamento.Orcamento;
import br.com.designpatterns.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = dados.getOrcamento();
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(acao -> acao.executarAcao(pedido));
	}

}
