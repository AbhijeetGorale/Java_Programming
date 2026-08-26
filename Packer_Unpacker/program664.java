//file writter write String 
//file outputStream write binary

import java.io.*; 
import java.util.*;  

class program664                               
{
    public static void main(String A[]) throws IOException
    {
        FileWriter fwobj = new FileWriter("Demo.txt");
        
        fwobj.write("Jay Ganesh...");

        fwobj.close();  // imp to write the data
    }
} 
