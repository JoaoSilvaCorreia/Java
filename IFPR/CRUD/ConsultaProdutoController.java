package br.edu.ifpr.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.edu.ifpr.model.bean.Produto;
import br.edu.ifpr.model.conexao.FabricaDeConexoes;
import br.edu.ifpr.model.dao.ProdutoDAO;

public class ConsultaProdutoController implements ActionListener {
	
	private JTextField tfBusca;
	private DefaultTableModel tm;
	
	public ConsultaProdutoController(JTextField tfBusca, DefaultTableModel tm) {
		super();
		this.tfBusca = tfBusca;
		this.tm = tm;
	}

	public void actionPerformed(ActionEvent e) {
		
		String termoDeBusca = tfBusca.getText();
		if (termoDeBusca != null && !termoDeBusca.equals("")) {
			tm.setDataVector(getProdutos(termoDeBusca), getCabecalho());
		} else {
			JOptionPane.showMessageDialog(null, "O termo de busca está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Define o cabeçalho
	 * 
	 * @return
	 */
	private Object[] getCabecalho() {
		Object[] cabecalhoTabela = {"ID", "Nome", "Descrição"};
		return cabecalhoTabela;
	}
	
	/**
	 * Retorna os produtos do banco de dados
	 * 
	 * @return
	 */
	private Object[][] getProdutos(String termoDeBusca) {
		
		ProdutoDAO dao = new ProdutoDAO(FabricaDeConexoes.getConexao());
		List<Produto> produtos = dao.retrieve(termoDeBusca);
		
		Object[][] dados = new Object[produtos.size()][3];
		int i = 0;
		for (Produto produto : produtos) {
			dados[i][0] = produto.getId();
			dados[i][1] = produto.getNome();
			dados[i][2] = produto.getDescricao();
			i++;
		}
		return dados;
	}

	
}
