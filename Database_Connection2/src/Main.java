import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost/database";
      Connection connection= DriverManager.getConnection(url,"root","root");
        System.out.println("connection sucessful");

        Statement statement= connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from table1");
        while(resultSet.next()){
            String name=resultSet.getString("name");
            System.out.println(name);
        }
        //insertion,deletion,update in database mysql
       statement.executeUpdate("update table1 set name='Sudarshan' where id=2");
       statement.executeUpdate("delete from table1 where id=2");
       statement.executeUpdate("insert into table1(name,address) values('pranam','bkt')");



    }
}