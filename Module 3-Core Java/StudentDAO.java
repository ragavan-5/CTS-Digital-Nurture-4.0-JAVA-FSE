import java.sql.*;
public class StudentDAO {
    Connection con;
    public StudentDAO() throws Exception {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:test.db");
    }
    public void insert(int id, String name) throws Exception {
        PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        ps.close();
    }
    public void update(int id, String name) throws Exception {
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
        ps.close();
    }
}

