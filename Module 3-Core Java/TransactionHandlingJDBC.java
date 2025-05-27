import java.sql.*;
public class TransactionHandlingJDBC {
    public static void transfer(Connection con, int fromId, int toId, int amount) throws Exception {
        con.setAutoCommit(false);
        try {
            PreparedStatement debit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id=?");
            debit.setInt(1, amount);
            debit.setInt(2, fromId);
            debit.executeUpdate();
            PreparedStatement credit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id=?");
            credit.setInt(1, amount);
            credit.setInt(2, toId);
            credit.executeUpdate();
            con.commit();
        } catch(Exception e) {
            con.rollback();
        }
    }
}
