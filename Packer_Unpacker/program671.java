//file writter write String 
//file outputStream write binary

import java.io.*; 
import java.util.*;  

class program671       
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        File fobj = null ;

        System.out.println("Enter file name :");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        if(fobj.exists())
        {
            System.out.println("File name : "+fobj.getName());
            System.out.println("Absolute path : "+fobj.getAbsolutePath());
            System.out.println("File size : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
} 
