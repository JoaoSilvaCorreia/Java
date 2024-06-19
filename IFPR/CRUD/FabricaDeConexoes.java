package br.edu.ifpr.model.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConexoes {

	// Variável que guarda a conexão com o banco de dados
	private static Connection conexao;
	
	// Retorna a conexão com o banco de dados
	public static Connection getConexao() {
		String stringConexao = "jdbc:sqlite:crud.db";
		String usuario = "sa";
		String senha = "";
		
		try {
			Class.forName("org.sqlite.JDBC");
			conexao = DriverManager.getConnection(stringConexao, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conexao;
	}
}
