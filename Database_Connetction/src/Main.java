import java.sql.*;

import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/database", "root", "root");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from table1");
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String address = resultSet.getString("address");
//                System.out.println(id + " " + name + " " + address);
//            }
//            connection.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//helps to use jar file
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/database";
        Connection connection= DriverManager.getConnection(url, "root", "root");
        System.out.println("connection succesful");



        //create the query
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from table1");
        //System.out.println(resultSet.next());
        while(resultSet.next()){
          String name=  resultSet.getString("name");
            System.out.println(name);
        }



    }
}








