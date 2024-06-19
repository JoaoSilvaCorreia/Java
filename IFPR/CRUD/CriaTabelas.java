package br.edu.ifpr.model.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ifpr.model.bean.Produto;
import br.edu.ifpr.model.dao.ProdutoDAO;

public class CriaTabelas {


	public static void main(String[] args) {
		populaTabelaProduto();
		
	}
	
	private static void criarTabelaProduto() {
		try {
			Connection conexao = FabricaDeConexoes.getConexao();
			Statement stmt = conexao.createStatement();
			String sql = "CREATE TABLE PRODUTO " +
					"(ID 		INTEGER PRIMARY KEY AUTOINCREMENT,"  +
					"NOME		TEXT,"  +
					"DESCRICAO	TEXT)";
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Tabela criada com sucesso!");	
	}
	
	private static void populaTabelaProduto() {
		Produto p1 = new Produto();
		p1.setNome("Mouse");
		p1.setDescricao("Mouse Logitech");
		
		Produto p2 = new Produto();
		p2.setNome("Monitor");
		p2.setDescricao("Monitor Samsung");
		
		Produto p3 = new Produto();
		p3.setNome("Teclado");
		p3.setDescricao("Teclado Dell");
		
		ProdutoDAO produtoDAO = new ProdutoDAO(FabricaDeConexoes.getConexao());
		produtoDAO.create(p1);
		produtoDAO.create(p2);
		produtoDAO.create(p3);
	}
	
}
