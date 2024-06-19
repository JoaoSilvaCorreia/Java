package br.edu.ifpr.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.ifpr.control.CadastroProdutoController;

public class CadastroProdutoView {
	
	public CadastroProdutoView() {
		final JFrame frame = new JFrame("Swing MVC Cadastro Produto");
		JPanel panNome = new JPanel();
		panNome.setLayout(new FlowLayout());
		panNome.add(new JLabel("Nome:"));
		JTextField tfNome = new JTextField(15);
		panNome.add(tfNome);
		JPanel panDescricao = new JPanel();
		panDescricao.setLayout(new FlowLayout());
		panDescricao.add(new JLabel("Descrição:"));
		JTextField tfDescricao = new JTextField(15);
		panDescricao.add(tfDescricao);
		JPanel panBotoes = new JPanel();
		panBotoes.setLayout(new FlowLayout());
		
		JButton btCadastrar = new JButton("Cadastrar");
		CadastroProdutoController cadastroProdutoController = new CadastroProdutoController(tfNome, tfDescricao);
		btCadastrar.addActionListener(cadastroProdutoController);
		
		JButton btCancelar = new JButton("Cancelar");
		btCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		panBotoes.add(btCadastrar);
		panBotoes.add(btCancelar);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(350, 150);
		frame.add(panNome);
		frame.add(panDescricao);
		frame.add(panBotoes);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
