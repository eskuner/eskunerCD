
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Artista;

public class ArtistaDao extends conexion.Conexion{
    
    /** Mostrar datos en tabla **/
    public ArrayList<Artista>consultar()throws Exception{
        ArrayList<Artista> lista = new ArrayList<Artista>();
        try {
            this.conectar();
            String sql = "select* from artista;";
            PreparedStatement ps = this.getConn().prepareStatement(sql);
                  ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Artista a = new Artista();
                a.setId_artista(rs.getInt(1));
                a.setNombre_real(rs.getString(2));
                a.setNacionalidad(rs.getString(3));
                a.setIdioma(rs.getString(4));
                                lista.add(a);
                         }
            return  lista;
        } catch (Exception e) {
            return null;
        }
    }
    
}
