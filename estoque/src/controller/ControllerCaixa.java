package controller;

import model.ModelCaixa;
import DAO.DAOCaixa;
import java.util.ArrayList;


public class ControllerCaixa {

    private DAOCaixa daoCaixa = new DAOCaixa();

    /**
    * grava Caixa
    * @param pModelCaixa
    * return int
     * @return 
    */
    public int salvarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }

    /**
    * recupera Caixa
    * @param pCodigo
    * return ModelCaixa
     * @return 
    */
    public ModelCaixa getCaixaController(int pCodigo){
        return this.daoCaixa.getCaixaDAO(pCodigo);
    }

    /**
    * recupera uma lista deCaixa
     * @return 
    */
    public ArrayList<ModelCaixa> getListaCaixaController(){
        return this.daoCaixa.getListaCaixaDAO();
    }

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * return boolean
     * @return 
    */
    public boolean atualizarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarCaixaDAO(pModelCaixa);
    }

    /**
    * exclui Caixa
    * @param pCodigo
    * return boolean
     * @return 
    */
    public boolean excluirCaixaController(int pCodigo){
        return this.daoCaixa.excluirCaixaDAO(pCodigo);
    }
}