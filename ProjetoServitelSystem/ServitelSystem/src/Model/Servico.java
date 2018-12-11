package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import objectTransferData.ObjectData;

/**
 *
 * @author joreel
 */
@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeSer;
    private String descricao;
    private double valor;

    public Servico() {
        super();
    }

    public Servico(String nomeSer, String descricao, double valor) {
        this.nomeSer = nomeSer;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeSer() {
        return nomeSer;
    }

    public void setNomeSer(String nomeSer) {
        this.nomeSer = nomeSer;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", nomeSer=" + nomeSer + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

    public boolean checaAtributos() {
        boolean check = true;

        if (this.descricao.trim().equalsIgnoreCase("")) {
            ObjectData.SendToMsg("A descrição do serviço está fazia.");
            check = false;
        }

        if (this.nomeSer.trim().equalsIgnoreCase("")) {
            ObjectData.SendToMsg("O Nome do serviço está fazia.");
            check = false;
        }

        if (this.valor <= 0.0) {
            ObjectData.SendToMsg("O Valor do serviço está fazia.");
            check = false;
        }

        return check;
    }

}
