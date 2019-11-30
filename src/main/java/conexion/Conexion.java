
package conexion;

import  java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    static  String bd = "cd_eskuner";
    static  String user = "root";
    static  String pass = "root";
    static  String url = "jdbc:mysql://localhost/"+bd+"?useSSL=false";
    
    private Connection conn;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public void conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, pass);
            if(this.conn !=null){
                System.out.println("Conectado");
            }else{
                System.out.println("Error");
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void desconectar() throws Exception{
        try {
            if(this.conn !=null){
                if(this.conn.isClosed() !=true){
                    this.conn.close();
                }
            }
        } catch (Exception e) {
         throw e;
        }
    }
}
