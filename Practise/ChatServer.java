import java.net.*;
import java.io.*;

class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server Application is Running...");

        ServerSocket ssobj = new ServerSocket(2100);

        System.out.println("Server is waiting at port 2100");

        Socket sobj = ssobj.accept();

        System.out.println("Client Request Gets Accepted Succesfully");  // conneted  succesfully with Client 
        //-------------------------------------------------------------------------------------------------------------------

        PrintStream pobj = new PrintStream(sobj.getOutputStream());  // talk

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));  //Ears Of server

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));  //keyboard input


        System.out.println("------------------------------------------------------------------------------");
        System.out.println("----------------------Marvellous Chat Server----------------------------------");
        System.out.println("------------------------------------------------------------------------------");

        String str1 = null,str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client Says :"+str1);
            System.out.println("Enter Message For Client : ");
            str2 = bobj2.readLine();
            pobj.println(str2);   
        }

        sobj.close();
        ssobj.close();

    }
    
}