import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class KGWanyStatement {
    public int F(int x) {
        int calculation = x + 1;
        return calculation;
    }

    public static void main(String[] args) {

        try {
            // mySQL workbench 실행 : JDBC
            // -USER, PASSWORD 접속 ip = port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB 연결 성공");
            // editor 띄우는 것임. import java.sql.statement
            Statement statement = connection.createStatement(); // import sql의 statement 임.
            // methods만들어봐야...
            // ReseultSet
            // f(x) = x + 1
        } catch (

        Exception e) {
            System.out.println();
            // TODO: handle exception
        }
    }
}
