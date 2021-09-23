package br.com.designpatterns.loja.pedido;

import java.math.BigDecimal;

import br.com.designpatterns.loja.orcamento.Orcamento;

public class GeraPedido {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	private Orcamento orcamento;
	
	//injecao de dependencias: PedidoRepository, EmailService...
	public GeraPedido(String cliente, Orcamento orcamento) {
		this.cliente = cliente;
		this.valorOrcamento = orcamento.getValor();
		this.quantidadeItens = orcamento.getQuantidadeItens();
		this.orcamento = orcamento;
	}
	
	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public Orcamento getOrcamento() {
		return orcamento;
	}
	
}
