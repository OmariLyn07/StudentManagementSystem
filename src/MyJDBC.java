import java.sql.*;

public class MyJDBC {
    public static void main(String[] args){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/monster",
                    "root",
                    "5645");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM MONSTERS");

            while(resultset.next()){
                System.out.println(resultset.getString("username"));
                System.out.println(resultset.getString("password"));
            }


        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
