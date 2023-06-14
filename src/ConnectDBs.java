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
            ResultSet resultSet = statement.executeQuery(query); // 하면 결과값이 return됨. ..??
            while (resultSet.next()) {
                // query의 table을 가져올건데, 나올 값이 끝날때까지 돌기. next는 자체내에서 뭉치를 던지는 동작을함. 레코드가 다음레코드로
                // 넘어감.
                System.out.println(
                        resultSet.getString("COMPANY_ID") + " " + // getStting은 DB의 type을 따라가기때문에 getString
                                resultSet.getString("COMPANY"));
            }
            // 0612실습한거 따라하기
            // COUNT 가능_ car의 factory count //table은 workbench 선택된거까지 됨.
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = statement.executeQuery(query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT")); // 이때 CNT는 SQL의 SELECT문에 COUNT의 AS로 CNT 명명함
                totalCount = resultSet.getInt("CNT");
                System.out.println("end");
            }
            // INSERT로 새로운 회사 삽입
            // INSERT INTO factorys (COMPANY_ID, COMPANY)
            // VALUES ("CAR-01", "AUDI");
            // String companyId = "CAR-01";
            // String company = "AUDI" ;
            // query = "INSERT INTO factorys " +
            //         "(COMPANY_ID, COMPANY) " +
            //         " VALUE " +
            //         "('"+companyId+"', '"+company+"') ";
            // int count = statement.executeUpdate(query);
            // System.out.println();

            // update factorys
            // SET COMPANY = '패퍼리'
            // WHERE COMPANY_ID = CAR-01
            /*
            UPDATE factorys
            SET COMPANY = '페라리'
            WHERE COMPANY_ID = 'CAR-01';
            */
            // // 변수를 넣어줄때 싱글 쿼테이션 '' 안에 더블 쿼테이션 ""을 넣고 ++사이에 변수를 넣어줘야한다.
            String companyId = "CAR-01";
            String company = "페라리";
            query = "UPDATE factorys"+
            " SET COMPANY = '"+company+"'" +
            " WHERE COMPANY_ID = '"+companyId+"'";
            int count = statement.executeUpdate(query);
            System.out.println("업데이트 됨 : " + count);
            
            // DELETE FROM factorys
            // WHERE COMPANY_ID = CAR-01
            // String companyId = "CAR-01";
            // query = "DELETE FROM factorys " + "WHERE COMPANY_ID = '"+companyId+"'";  // CAR-01 페라리 삭제
            // int count = statement.executeUpdate(query);
            // System.out.println("업데이트 됨 : " + count);
            // // count = statement.executeUpdate(query);

            // System.out.println("Deleted");

        } catch (Exception e) {
             System.out.println(e.getMessage());   // 에러 내용을 볼수 있는 명령문
            // TODO: handle exception
        }
        System.out.println();

    }
}
