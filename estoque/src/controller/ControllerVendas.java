package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.sql.Date;
import java.util.ArrayList;


public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();


    /**
    * grava Vendas
    * @param pModelVendas
    * return int
     * @return 
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pCodigo
    * return ModelVendas
    */
    public ModelVendas getVendasController(int pCodigo){
        return this.daoVendas.getVendasDAO(pCodigo);
    }

    /**
    * recupera uma lista deVendas
     * @return 
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /* recupera uma lista deVendas
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(int pCodigo){
        return this.daoVendas.getListaVendasDAO(pCodigo);
    }
    
    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
     * @return 
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pCodigo
    * return boolean
     * @return 
    */
    public boolean excluirVendasController(int pCodigo){
        return this.daoVendas.excluirVendasDAO(pCodigo);
    }

    public boolean salvarVendasProdutosController(ModelVendas modelVendas) {
        return this.daoVendas.salvarProdutosVendasDAO(modelVendas);
    }


    /**
     * Excluir os produtos de uma venda
     * @param pCodigo
     * @return 
     */
    public boolean excluirProdutoVendasController(int pCodigo) {
        return this.daoVendas.excluirProdutoVendasDAO(pCodigo);
    }

    public ArrayList<ModelVendas> getListaVendasController(ModelVendas pMdelVendas) {
        return this.daoVendas.getListaVendasDAO(pMdelVendas);
    }
}