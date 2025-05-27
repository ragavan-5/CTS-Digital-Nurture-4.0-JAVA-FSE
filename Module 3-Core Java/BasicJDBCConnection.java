import java.sql.*;
public class BasicJDBCConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while(rs.next()) System.out.println(rs.getInt(1) + " " + rs.getString(2));
        rs.close();
        stmt.close();
        con.close();
    }
}
