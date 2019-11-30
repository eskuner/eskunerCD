package modelo;

public class Venta{
    private int id_venta;
    private String cantidad;
    private Informacion_disco infotmacion;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Informacion_disco getInfotmacion() {
        return infotmacion;
    }

    public void setInfotmacion(Informacion_disco infotmacion) {
        this.infotmacion = infotmacion;
    }
    
    
}