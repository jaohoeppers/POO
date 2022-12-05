package com.classes.BO;

import com.classes.DTO.Cliente;
import com.classes.DAO.ClienteDAO;
import java.util.List;

public class ClienteBO {

    public boolean inserir(Cliente marca){
        if (existeNome(marca)&(existeEmail(marca)) != true) {
        	ClienteDAO marcasDAO = new ClienteDAO();
            return marcasDAO.inserir(marca);
        }
        return false;
    }
    public boolean alterar(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.alterar(marca);
    }
    public boolean excluir(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.excluir(marca);
    }
    public Cliente procurarPorCodigo(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.procurarPorCodigo(marca);
    }
    public Cliente procurarPorNome(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.procurarPorNome(marca);
    }
    public Cliente procurarPorEmail(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.procurarPorEmail(marca);
    }
    public boolean existeEmail(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.existeEmail(marca);
    }
    public boolean existeNome(Cliente marca){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.existeNome(marca);
    }
    public List<Cliente> pesquisarTodos(){
    	ClienteDAO marcasDAO = new ClienteDAO();
        return marcasDAO.pesquisarTodos();
    }
}