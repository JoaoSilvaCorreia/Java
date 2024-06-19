package br.edu.ifpr.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.ifpr.control.ConsultaProdutoController;

public class ConsultaProdutoView {
	
	public ConsultaProdutoView() {
		
		// Criando as visões dos componentes de interface do usuário
		JTextField tfBusca = new JTextField(26);
		JButton btFiltro = new JButton("Filtrar");
		JTable tbProdutos = new JTable();
		
		// Cria table model
		DefaultTableModel tm = new DefaultTableModel();
		tbProdutos.setModel(tm);
		
		// Cria o controle
		ConsultaProdutoController controllerProduto = new ConsultaProdutoController(tfBusca, tm);
		btFiltro.addActionListener(controllerProduto);
		
		// Define o layout da visão
		JPanel painelPesquisa = new JPanel();
		painelPesquisa.add(tfBusca);
		painelPesquisa.add(btFiltro);
		
		JScrollPane spTable = new JScrollPane(tbProdutos);
		spTable.setPreferredSize(new Dimension(700, 182));
		spTable.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Produtos",
				TitledBorder.CENTER, TitledBorder.TOP));
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, painelPesquisa, spTable);
		splitPane.setDividerLocation(35);
		splitPane.setEnabled(false);
		
		// Coloca em uma janela
		JFrame frame = new JFrame("Swing MVC Produto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(splitPane);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
