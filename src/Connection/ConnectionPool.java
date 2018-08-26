package Connection;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

public class ConnectionPool
{
    private static BasicDataSource connectionPool;
    public static void main(String[] args) throws SQLException {
        connectionPool = new BasicDataSource();
        connectionPool.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connectionPool.setUrl("jdbc:sqlserver://localhost;database=JFMS");
        connectionPool.setUsername("sa");
        connectionPool.setPassword("sqlsa");

        Connection con = connectionPool.getConnection();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from mydb");
        Stream.of(resultSet).forEach(t-> {
            try {
                System.out.println(t.getInt(0));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
    }
}
