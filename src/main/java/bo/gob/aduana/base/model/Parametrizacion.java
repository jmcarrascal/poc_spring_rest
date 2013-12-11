package bo.gob.aduana.base.model;


/**
 * Esta clase modela los parametros de la aplicaci�n
 *
 * @author Juan Manuel Carrascal
 */


public class Parametrizacion {

    private Long idParametrizacion;
    private String descrip;
    private String valor;

    
    public Long getIdParametrizacion() {
        return idParametrizacion;
    }

    public void setIdParametrizacion(Long idParametrizacion) {
        this.idParametrizacion = idParametrizacion;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
