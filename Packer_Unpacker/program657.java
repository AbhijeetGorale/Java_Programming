import java.io.*;        // input output

class program657
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt") ;
        
            System.out.println(fobj.exists());  //  exist or not
        }
        catch(Exception eobj)
        {
            System.out.println("eobj");
        }
    }
} 
