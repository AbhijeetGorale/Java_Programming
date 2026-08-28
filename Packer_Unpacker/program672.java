import java.io.*;      // file outputString use to write in byte
import java.util.*;  

class program672     
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        File fobj = null ;

        FileOutputStream foobj =  null ;

        System.out.println("Enter file name :");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        foobj  = new FileOutputStream(fobj);

        String Data ="Marvellous InfoSystem";

        if(fobj.exists())
        {
            foobj.write(Data); // error
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
} 
