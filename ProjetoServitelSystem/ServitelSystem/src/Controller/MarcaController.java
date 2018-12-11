package Controller;

import ADO.MarcaAdo;
import Model.MarcaModel;
import java.util.List;
import objectTransferData.ObjectData;

public class MarcaController {

    public boolean salvar(MarcaModel marca){
        MarcaAdo marcaAdo = new MarcaAdo();
        boolean check = false;
        try{
            if (marcaAdo.salvar(marca)) {
                ObjectData.SendToMsg(marcaAdo.getMensagem());
                check = true;
            } else {
                ObjectData.SendToMsg(marcaAdo.getMensagem());
                check = false;
            }
        }catch (RuntimeException e){
            ObjectData.SendToMsg(e.getMessage());
        }
        return check;
    }

    //Depois retirar essa função daqui
    public boolean consultaPorNome(String nome) {
        MarcaAdo marcaAdo = new MarcaAdo();
        boolean check = false;
        try {
            if (marcaAdo.consultaPorNome(nome)) {
                ObjectData.SendToMsg(marcaAdo.getMensagem());
                check = true;
            } else {
                check = false;
            }
        } catch (Exception ex) {
            ObjectData.SendToMsg(ex.getMessage());
        }
        return check;
    }

    public List<MarcaModel> Consulta() {
        MarcaAdo marcaAdo = new MarcaAdo();
        /**
         * if (marcaAdo.ConsultaTodos().isEmpty()) { ObjectData.SendToMsg("Não
         * existe nenhuma marca cadastrada."); return null; }
         */
        return marcaAdo.ConsultaTodos();

    }

    public boolean alterar(MarcaModel marca) {
        MarcaAdo marcaAdo = new MarcaAdo();
        System.out.println("Controller:" + marca);
        if (marcaAdo.alterar(marca)) {
            ObjectData.SendToMsg(marcaAdo.getMensagem());
            return true;
        } else {
            ObjectData.SendToMsg(marcaAdo.getMensagem());
            return false;
        }
    }

    public boolean excluir(MarcaModel marca) {
        MarcaAdo marcaAdo = new MarcaAdo();
        if (marcaAdo.excluir(marca.getIdMarca())) {
            ObjectData.SendToMsg(marcaAdo.getMensagem());
            return true;
        } else {
            ObjectData.SendToMsg(marcaAdo.getMensagem());
            return false;
        }
    }
}
