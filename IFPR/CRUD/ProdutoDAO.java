package br.edu.ifpr.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.model.bean.Produto;

/**
 * DAO (Data Access Object) se refere a classe que irá
 * fazer a comunicação dos sistema com o banco de dados.
 * Esse padrão é muito importante. Ele promove a reutilização
 * de código, também promove a boa manutenção do código
 * pois ele não deixa que o código de acesso ao banco de
 * dados fique misturado com outras partes da aplicação que
 * possuem outros objetivos.
 * 
 * 
 *
 */
public class ProdutoDAO {

	// Objeto de conexão que será utilizado para
	// fazer a ligação com o banco de dados
	private Connection conexao;
	
	public ProdutoDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	/**
	 * Grava o produto no banco de dados
	 * 
	 * @param produto
	 */
	public void create(Produto produto) {
		try {
			String sql = "insert into produto (nome, descricao) values (?,?)";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.executeUpdate();
			ps.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Lê um produto do banco de dados
	 * 
	 * @param id
	 * @return Produto
	 */
	public Produto retrieve(int id) {
		Produto produto = new Produto();
		try {
			// Define a consulta SQL
			String sql = "select * from produto where id = " + id;
			// Associa conexão com a declaração
			Statement query = conexao.createStatement();
			// Executa a consulta SQL
			ResultSet rs = query.executeQuery(sql);
			// Recuperar dados do conjunto (Set, ResultSet)
			while (rs.next()) {
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produto;
	}
	
	/**
	 * Atualiza um produto no banco de dados
	 * 
	 * @param produto
	 */
	public void update(Produto produto) {
		try {
			// Define a consulta SQL
			String sql = "update produto set nome = ?, descricao = ? where id = ?";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setInt(3, produto.getId());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Apaga o produto do banco de dados
	 * 
	 * @param produto
	 */
	public void delete(Produto produto) {
		try {
			// Define a consulta SQL
			String sql = "delete from produto where id = ?";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, produto.getId());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Lê todos os produto do banco de dados
	 * 
	 * @param id
	 * @return List<Produto>
	 */
	public List<Produto> retrieve() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		try {
			// Define a consulta SQL
			String sql = "select * from produto";
			// Associa conexão com a declaração
			Statement query = conexao.createStatement();
			// Executa a consulta SQL
			ResultSet rs = query.executeQuery(sql);
			// Recuperar dados do conjunto (Set, ResultSet)
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));
				
				produtos.add(produto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}
	
	
	/**
	 * Lê os produto que iniciam com os caracteres do banco de dados
	 * 
	 * @param id
	 * @return List<Produto>
	 */
	public List<Produto> retrieve(String nome) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		try {
			// Define a consulta SQL
			String sql = "select * from produto where nome like '"+ nome + "%'";
			// Associa conexão com a declaração
			Statement query = conexao.createStatement();
			// Executa a consulta SQL
			ResultSet rs = query.executeQuery(sql);
			// Recuperar dados do conjunto (Set, ResultSet)
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));
				
				produtos.add(produto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}
	
}
