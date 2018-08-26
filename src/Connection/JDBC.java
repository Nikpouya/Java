package Connection;

import java.sql.*;
import java.util.stream.Stream;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;database=JFMS","sa","sqlsa");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from mytable");
        while (resultSet.next())
        {
            resultSet.getInt(0);
        }

        Stream.of(resultSet).forEach(t-> {
            try {
                t.getInt(0);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }
}
