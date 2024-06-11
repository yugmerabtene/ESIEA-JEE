package fr.esiea.services;
import fr.esiea.models.User;
import fr.esiea.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import  java.sql.SQLException;
public class UserService {
    public void addUser(User user) throws SQLException{
        String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
        }
    }
}
