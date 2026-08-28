import java.io.*;      // file outputString use to write in byte
import java.util.*;  

class program673     
{
    public static void main(String A[])
    {
        String Data = "Marvellous Infosystems";

        byte Arr[] = Data.getBytes();   // String to byte array 
        
        System.out.println(Data.length());

        System.out.println(Arr.length);
    }
} 
