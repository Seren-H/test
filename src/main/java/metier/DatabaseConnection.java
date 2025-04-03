package metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // URL de la base de données MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/amitdb?serverTimezone=UTC";
    private static final String USER = "root"; // Remplace par ton utilisateur
    private static final String PASSWORD = "zouba2014"; // Remplace par ton mot de passe

    // Méthode pour obtenir une connexion à la base de données
    public static Connection getConnection() throws SQLException {
        try {
            // Connexion à la base de données MySQL
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Erreur de connexion à la base de données: " + e.getMessage());
        }
    }
}
