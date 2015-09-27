package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.entidades.PessoaJuridica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;
import br.unibh.pessoas.persistencia.PessoaJuridicaDAO;

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
		PessoaFisica p = dao.find(117L);
		Assert.assertEquals(p.getNome(), "Valentine Burks");

	}

	@Test
	public void testePessoaFisicaInserirExcluir() {

		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Fulano da Silva", "Rua A", "3133333333", "11122233344",
				"fulano@gmail.com", new Date(), "M");
		dao.insert(pf);

		PessoaFisica pf2 = dao.find("Fulano da Silva");
		Assert.assertNotNull(pf2);

		dao.delete(pf2);
		PessoaFisica pf3 = dao.find("Fulano da Silva");
		Assert.assertNull(pf3);
	}

	@Test
	public void testePessoaFisicaAtualizar() {

		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Ciclano da Silva", "Rua A", "3133333333", "11122233344",
				"fulano@gmail.com", new Date(), "M");
		dao.insert(pf);

		PessoaFisica pf2 = dao.find("Ciclano da Silva");
		pf2.setNome("Beltrano Da Silva");
		pf2.setEmail("beltrano@gmail.com");

		dao.update(pf2);
		PessoaFisica pf3 = dao.find("Beltrano da Silva");
		Assert.assertEquals(pf3.getEmail(), "beltrano@gmail.com");
		Assert.assertNotNull(pf3);

		dao.delete(pf3);
		PessoaFisica pf4 = dao.find("Beltrano da Silva");
		Assert.assertNull(pf4);

	}
	
	
	/*
	 * Testes pessoa jurídica
	 * 
	 */
	
	
	
	
	@Test
	public void testePessoaJuridicaFindaAll() {

		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		List<PessoaJuridica> l = dao.findAll();
		Assert.assertEquals(l.size(), 100);
	}

	@Test
	public void testePessoaJuridicaFind() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica p = dao.find(101L);
		Assert.assertEquals(p.getNome(), "Kuame Hogan");

	}

	@Test
	public void testePessoaJuridicaInserirExcluir() {

		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pj = new PessoaJuridica(null, "Fulano da Silva", "Rua A", "3133333333", "12345678912345",
				"fulanoempresa@gmail.com", new Date(), "wwwfulanobr");
		dao.insert(pj);

		PessoaJuridica pj2 = dao.find("Fulano da Silva");
		Assert.assertNotNull(pj2);

		dao.delete(pj2);
		PessoaJuridica pj3 = dao.find("Fulano da Silva");
		Assert.assertNull(pj3);
	}

	@Test
	public void testePessoaJuridicaAtualizar() {

		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pj = new PessoaJuridica(null, "Ciclano da Silva", "Rua A", "3133333333", "12345678954321",
				"fulano@gmail.com", new Date(), "wwwciclanobr");
		dao.insert(pj);

		PessoaJuridica pj2 = dao.find("Ciclano da Silva");
		pj2.setNome("Beltrano Da Silva");
		pj2.setEmail("beltrano@gmail.com");

		dao.update(pj2);
		PessoaJuridica pj3 = dao.find("Beltrano da Silva");
		Assert.assertEquals(pj3.getEmail(), "beltrano@gmail.com");
		Assert.assertNotNull(pj3);

		dao.delete(pj3);
		PessoaJuridica pj4 = dao.find("Beltrano da Silva");
		Assert.assertNull(pj4);

	}

}

	



	


