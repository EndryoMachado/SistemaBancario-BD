package br.com.DAO;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.connectionFactory.ConnectionFactory;
import br.com.POJO.pessoaFisicaPOJO;

public class pessoaFisicaDAO {
	private Connection conn;
	
	public pessoaFisicaDAO() {
		this.conn = ConnectionFactory.getConnection();
	}
	
	public boolean insereCliente(pessoaFisicaPOJO cliente) {
		String sql = "INSERT INTO public.cliente_pf(numero_conta, nome, cpf, idade, agencia, telefone, saldo, cheque_especial)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	
		try {
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, cliente.getNumeroConta());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getCpf());
			stmt.setInt(4, cliente.getIdade());
			stmt.setString(5, cliente.getAgencia());
			stmt.setString(6, cliente.getTelefone());
			stmt.setDouble(7, cliente.getSaldo());
			stmt.setDouble(8, cliente.getChequeEspecial());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			System.err.println("Erro ao realizar a inserção");
			System.err.println(e.getMessage());
			return false;
		}
	
		return true;
	}
	
	public boolean removeCliente(int numeroConta) {

        String sql = "DELETE FROM public.cliente_pf WHERE numero_conta = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, numeroConta);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.err.println("Erro ao remover cliente");
            System.err.println(e.getMessage());
            return false;
        }

        return true;
    }
}
