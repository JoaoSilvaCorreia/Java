package br.edu.ifpr.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.ifpr.model.bean.Produto;
import br.edu.ifpr.model.conexao.FabricaDeConexoes;
import br.edu.ifpr.model.dao.ProdutoDAO;

public class CadastroProdutoController implements ActionListener{
	
	private JTextField tfNome;
	private JTextField tfDescricao; 
	
	public CadastroProdutoController(JTextField tfNome, JTextField tfDescricao) {
		super();
		this.tfNome = tfNome;
		this.tfDescricao = tfDescricao;
	}

	public void actionPerformed(ActionEvent e) {
		ProdutoDAO produtoDAO = new ProdutoDAO(FabricaDeConexoes.getConexao());
		Produto produto = new Produto();
		produto.setNome(tfNome.getText());
		produto.setDescricao(tfDescricao.getText());
		produtoDAO.create(produto);
		JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Sucesso!", JOptionPane.OK_OPTION);
	}

}
