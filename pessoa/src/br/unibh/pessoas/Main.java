package br.unibh.pessoas;

import br.unibh.pessoas.entidades.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Jo�o");
		
		Pessoa p2 = new Pessoa(1L, "Maria");
		
		Pessoa p3 = new Pessoa(2L, "Tiago", "Rua A", "3333-2222");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
				

	}

}