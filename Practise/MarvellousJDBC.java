import java.sql.*;
public class MarvellousJDBC
{
    public  static void main(String []args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54","root","");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from Student2");

            while(rs.next())
            {
                System.out.println("Rno:"+ rs.getInt("rno"));

                System.out.println("Name:"+ rs.getString("Name"));

                System.out.println("City:" +rs.getString("City"));

                System.out.println("Marks:" +rs.getInt("Marks"));

                System.out.println("--------------------------------------------------------------------------------");
            }

            rs.close();

            stmt.close();

            con.close();
        }

        catch(Exception e)
        {
            System.out.println("Exception Occured:" + e);
        }
    }

}


// COMPILE = javac -cp