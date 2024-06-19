/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.control;

import br.edu.ifpr.model.bean.Usuario;
import br.edu.ifpr.model.dao.PessoaDAO;
import br.edu.ifpr.model.util.PersistenceUtil;
import br.edu.ifpr.view.LoginView;
import br.edu.ifpr.view.MenuPrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 */

public class LogarController implements ActionListener {
    private JTextField txtUsuario ; 
    private JTextField txtSenha;
    private LoginView loginView;
    
    private void limpaCampos(){
        txtUsuario.setText("");
        txtSenha.setText("");

    }
            

    public LogarController(JTextField txtUsuario, JTextField txtSenha, LoginView loginView) {
        this.txtUsuario = txtUsuario;
        this.txtSenha = txtSenha;
        this.loginView = loginView;
                
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Usuario u = new Usuario();
        PessoaDAO usuarioDAO = new PessoaDAO(PersistenceUtil.getEntityManager());
        if (usuarioDAO.retrieveUsuario(txtSenha.getText(), txtUsuario.getText())) {
            // Abrir a janela principal
            loginView.setVisible(false);
            MenuPrincipalView menuP = new MenuPrincipalView();
            menuP.setVisible(true);
            
        } else {
            // Mensagem de usuário inválido
            JOptionPane.showMessageDialog(null,"Usuário ou Senha incorretos!");
            limpaCampos();
            
        }
                
    }
}
            
