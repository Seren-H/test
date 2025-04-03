package controller;

import dao.ProduitDAO;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/connexion")  // URL d'accès : http://localhost:8080/untitled3/connexion
public class ProduitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProduitDAO produitDAO = new ProduitDAO();
        boolean isConnected = produitDAO.testConnection();

        // Définir le message pour la JSP
        request.setAttribute("message", isConnected ? "Connexion réussie !" : "Échec de connexion");

        // Vérification console
        System.out.println("Message envoyé à la JSP : " + request.getAttribute("message"));

        // Rediriger vers connexion.jsp
        request.getRequestDispatcher("/connexion.jsp").forward(request, response);
    }
}
