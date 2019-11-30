
package modelo;

public class Informacion_disco {
    private int id_informacion;
    private double  precio_U;
    private  double  precio_M;
    private String codigo;
    private Compañia compañia;

    public int getId_informacion() {
        return id_informacion;
    }

    public void setId_informacion(int id_informacion) {
        this.id_informacion = id_informacion;
    }

    public double getPrecio_U() {
        return precio_U;
    }

    public void setPrecio_U(double precio_U) {
        this.precio_U = precio_U;
    }

    public double getPrecio_M() {
        return precio_M;
    }

    public void setPrecio_M(double precio_M) {
        this.precio_M = precio_M;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Compañia getCompañia() {
        return compañia;
    }

    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
    }
    
    
}
