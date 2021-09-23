package br.com.designpatterns.loja;

import java.math.BigDecimal;

import br.com.designpatterns.loja.imposto.CalculadoraDeImpostos;
import br.com.designpatterns.loja.imposto.ICMS;
import br.com.designpatterns.loja.imposto.ISS;
import br.com.designpatterns.loja.orcamento.ItemOrcamento;
import br.com.designpatterns.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS(new ISS(null))));
	}

}
