
package conexion;


public class Testing {
   
        public static void main(String[] args) {
        try {
            Conexion cn= new Conexion();
            cn.conectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
