package br.com.programaPrincipal;

import br.com.DAO.pessoaFisicaDAO;
import br.com.DAO.pessoaJuridicaDAO;
import br.com.POJO.pessoaFisicaPOJO;
import br.com.POJO.pessoaJuridicaPOJO;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		pessoaFisicaPOJO pessoa = new pessoaFisicaPOJO(1, "002", "003", 1200.00, 1000.00, 
				"1234", "nome", 10);
		pessoaFisicaDAO pessoaDAO = new pessoaFisicaDAO();
		
		pessoaJuridicaPOJO pessoaPJ = new pessoaJuridicaPOJO(2, "001", "123124", 1000.00, 500.00,
	            "54321", "juridico", "juridicofantasia");
		
		pessoaJuridicaDAO pessoaPJDAO = new pessoaJuridicaDAO();
		
		//pessoaPJDAO.insereCliente(pessoaPJ);
		
		pessoaPJDAO.removeCliente(2);
	}
}
