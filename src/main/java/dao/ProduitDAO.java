package dao;

import java.sql.Connection;
import java.sql.SQLException;
import metier.DatabaseConnection;

public class ProduitDAO {

    public boolean testConnection() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            if (connection != null) {
                System.out.println("Connexion à la base de données réussie."); // Log important
                return true;
            } else {
                System.out.println("Connexion à la base de données échouée."); // Log important
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur SQL lors de la connexion : " + e.getMessage());
            return false;
        }
    }
}
