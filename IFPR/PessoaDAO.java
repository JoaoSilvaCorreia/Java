/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.model.dao;

import br.edu.ifpr.model.bean.PessoaFisica;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 *
 */
public class PessoaDAO extends GenericDAO<Integer, PessoaDAO> {
    
    public PessoaDAO(EntityManager em) {
        super(em);
    }
 
    public boolean retrieveUsuario(String senha, String userName){
        TypedQuery<PessoaFisica> query = (TypedQuery<PessoaFisica>) em.createQuery(
            "SELECT pf FROM PessoaFisica pf WHERE pf.senha = :senha AND pf.userName = :userName",PessoaFisica.class);
        query.setParameter("userName", userName);
        query.setParameter("senha", senha);
        
        List<PessoaFisica> pessoasFisica = query.getResultList();
        if (pessoasFisica.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
