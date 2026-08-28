import java.io.*;      // file outputString use to write in byte
import java.util.*;  

class program678     
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        File fobj = null ;

        FileInputStream fiobj =  null ;

        System.out.println("Enter file name :");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        fiobj  = new FileInputStream(fobj);


        byte Arr [] = new byte[50];

        if(fobj.exists())
        {
            fiobj.read(Arr); 
            System.out.println(new String(Arr));     // convert byte array in string
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
} 
