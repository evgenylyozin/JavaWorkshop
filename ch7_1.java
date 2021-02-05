import java.sql.*;

public class ch7_1 {
    public static void main(String[] args) {
        
        Connection conn;
        String sql = "SELECT * from customer order by username";
        Statement statement;

        try {
            conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            statement = conn.createStatement();
            ResultSet results = statement.executeQuery(sql);

            while(results.next()) {
                Long id = results.getLong("CUSTOMER_ID");
                String username = results.getString("USERNAME");
                String firstname = results.getString("FIRST_NAME");
                String lastname = results.getString("LAST_NAME");

                System.out.println(id + " " + username + " " +
                firstname + " " + lastname);
            }

            if (results != null) {
                results.close();
            }
            if (statement != null) {
                statement.close();
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
