import java.sql.*;

public class MyJDBC {
    public static void main(String[] args){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/monsters",
                    "root",
                    "5645");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM monster");

            while(resultset.next()){
                System.out.println(resultset.getString("monster_name"));
            }


        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
