import java.sql.*;

import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args)  {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/database", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from table1");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                System.out.println(id + " " + name + " " + address);
            }
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    }

