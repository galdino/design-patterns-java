package br.com.designpatterns.loja.orcamento;

import java.util.Map;

import br.com.designpatterns.loja.DomainException;
import br.com.designpatterns.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter httpAdapter;
	
	public RegistroDeOrcamento(HttpAdapter httpAdapter) {
		this.httpAdapter = httpAdapter;
	}

	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento nao finalizado!");
		}
		
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
										   "quantidadeItens", orcamento.getQuantidadeItens());
		httpAdapter.post(url, dados);
	}

}
