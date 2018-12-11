package Model;

public class MarcaModel {

    private String nomeMarca;
    private int idMarca;

    public MarcaModel(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public MarcaModel(String nomeMarca, int idMarca) {
        this.nomeMarca = nomeMarca.trim();
        this.idMarca = idMarca;
    }

    public MarcaModel() {

    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca.trim();
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public boolean checaAtributos() {
        boolean check = true;
        if (this.nomeMarca.trim().equals("")) {
            check = false;
        }

        return check;
    }

    @Override
    public String toString() {
        return getNomeMarca();
    }

    /*@Override
    public String toString() {
        return "MarcaModel{" + "nomeMarca=" + nomeMarca + ", idMarca=" + idMarca + '}';
    }*/
}
