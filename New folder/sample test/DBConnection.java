
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getConnection() {

        try {
            if (con == null || con.isClosed()) {

                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/abctech",
                        "root",
                        "root"
                );

                System.out.println("Database Connected Successfully...");
            }
        }
        catch (Exception e) {
            System.out.println("Database Connection Failed!");
            System.out.println(e.getMessage());
        }

        return con;
    }
}