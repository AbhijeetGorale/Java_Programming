import java.net.*;
import java.io.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client Application is Running...");

        Socket sobj = new Socket("localhost",2100);

        System.out.println("Connection is Succesful WIth Server");   // connected succesfully with server
        //----------------------------------------------------------------------------------------------------------------------

        PrintStream pobj = new PrintStream(sobj.getOutputStream());  // tallk

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));  //Ears Of server

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));  //keuuboard input


        System.out.println("------------------------------------------------------------------------------");
        System.out.println("----------------------Marvellous Chat Client----------------------------------");
        System.out.println("------------------------------------------------------------------------------");

        String str1 = null , str2 = null;

        System.out.println("Enter Message For Server : ");

        while(!(str1 = bobj2.readLine()).equals("Bye"))   // End Massage
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server Says :"+str2);

            System.out.println("Enter Message for Server");

            sobj.close();
            
        }

        sobj.close();


    }
    
}