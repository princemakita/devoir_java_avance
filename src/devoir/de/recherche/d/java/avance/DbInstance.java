package devoir.de.recherche.d.java.avance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbInstance {
    private static final String url = "jdbc:mysql://localhost:3306/public";
    private static final String utilisateur = "root";
    private  static final String motDePass = "thedevs2024!";
    private static Connection con = null;

    public static Connection dbConnection(){
        try {
            con = DriverManager.getConnection(url, utilisateur, motDePass);
            System.out.println("Database connected!");
            return con;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }

    public static Connection getConnection(){
        return con == null? dbConnection():con;
    }

    public static void releaseConnection(){
        try {
            if(con != null){
                con.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
