package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;

public class Testes {

	@Test
	public void testePessoaFisicaFindaAll() {

		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> l = dao.findAll();
		Assert.assertEquals(l.size(), 100);
	}

	@Test
	public void testePessoaFisicaFind() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica p = dao.find(6L);
		Assert.assertEquals(p.getNome(), "Maya S. Logan");

	}

	public void testePessoaFisicaInserir() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Fulano da Silva", "Rua A", "3133334444", "12345678911",
				"fulano@gmail.com", new Date(), "M");
		dao.insert(pf);
		PessoaFisica pf2 = dao.find("Fulano da Silva");
		Assert.assertNotNull(pf2);

	}
	

	@Test
	public void testePessoaFisicaInserirExcluir (){
		
		PessoaFisicaDAO dao = new PessoaFisicaDAO ();
		PessoaFisica pf = new PessoaFisica(null, "Fulano da Silva", "Rua A", "3133333333", "11122233344",
				"fulano@gmail.com", new Date(), "M");
				dao.insert(pf);
		PessoaFisica pf2 = dao.find("Fulano da Silva");
		Assert.assertNotNull(pf2);
		PessoaFisica pf3 = dao.find("Fulano da Silva");
		Assert.assertNull(pf3);
	}
	
	
}
