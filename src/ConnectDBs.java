import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");
            // workbench의 DB의 table 더블클릭 (선택)까지 된거. 
            
            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query); //하면 결과값이 return됨. ..??
            while (resultSet.next()){
                //query의 table을 가져올건데, 나올 값이 끝날때까지 돌기. next는 자체내에서 뭉치를 던지는 동작을함. 레코드가 다음레코드로 넘어감. 
                System.out.println(
                resultSet.getString ("COMPANY_ID") + " " + // getStting은 DB의 type을 따라가기때문에 getString
                resultSet.getString ("COMPANY"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();

    }
}
