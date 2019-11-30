
package modelo;


public class Compañia {
 
    private int id_compañia;
    private String derechos;
    private String precio_compra;
    private Disco disco;
    private Disquera disquera;

    public int getId_compañia() {
        return id_compañia;
    }

    public void setId_compañia(int id_compañia) {
        this.id_compañia = id_compañia;
    }

    public String getDerechos() {
        return derechos;
    }

    public void setDerechos(String derechos) {
        this.derechos = derechos;
    }

    public String getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }
    
    
    
}
