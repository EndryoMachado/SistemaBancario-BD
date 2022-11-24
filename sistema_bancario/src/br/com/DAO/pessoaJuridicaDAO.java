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
import br.com.POJO.pessoaJuridicaPOJO;


public class pessoaJuridicaDAO {
    
    private Connection conn;
    
    public pessoaJuridicaDAO() {
		this.conn = ConnectionFactory.getConnection();
	}

    
    
    public boolean insereCliente(pessoaJuridicaPOJO clientePJ) {    
        
        String sql = ("INSERT INTO public.cliente_pj(\n"
                + "    numero_conta, nome_fantasia, cnpj, razao_social, agencia, telefone, saldo, cheque_especial)\n"
                + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
        
        
        PreparedStatement smt;    
        
        try {
                smt = conn.prepareStatement(sql);
                
                smt.setInt(1, clientePJ.getNumeroConta());
                smt.setString(2, clientePJ.getNomeFantasia());
                smt.setString(3, clientePJ.getCnpj());
                smt.setString(4, clientePJ.getRazaoSocial());
                smt.setString(5, clientePJ.getAgencia());
                smt.setString(6, clientePJ.getTelefone());
                smt.setDouble(7, clientePJ.getSaldo() );
                smt.setDouble(8,clientePJ.getChequeEspecial() );
                
                smt.execute();            
                smt.close();
                System.out.println("Cliente cadastrado!");
                System.out.println("-----------------------------------------------");
            return false;
            
        } catch (SQLException e) {
            e.printStackTrace();
         }
        return true;
    
    }
    
    public boolean removeCliente(int numeroConta) {

        String sql = "DELETE FROM public.cliente_pj WHERE numero_conta = ?";

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