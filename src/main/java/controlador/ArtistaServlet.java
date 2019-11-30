package controlador;

import java.io.IOException;
import modelo.Artista;
import dao.ArtistaDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ArtistaServlet", urlPatterns = {"/ArtistaServlet"})
public class ArtistaServlet extends HttpServlet {

    /**
     * importar dao*
     */
    ArtistaDao ad;

    public ArtistaServlet() {
        super();
        ad = new ArtistaDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ruta = "";
        String action = request.getParameter("select");
        try {
            switch (action) {
                case "menuadmi":
                    ruta = "view/menuAdmi.jsp";
                    break;
                    
                case "artista":
                    ruta = "view/artista.jsp";
                    try {
                        request.setAttribute("a", ad.consultar());
                        System.out.println("Entro la consulta");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                  break;
                  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher dt = request.getRequestDispatcher(ruta);
        dt.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
