import java.io.*;   

class program659
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt") ;

            boolean bRet = false;

            bRet = fobj.exists();   // if exists or not

            if(bRet ==true )
            {
                System.out.println("File already present");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File get succesfully created");
            }
        
        }
        catch(IOException iobj)
        {
            System.out.println("iobj");
        }
        catch(Exception eobj)
        {
            System.out.println("eobj");
        }
    }
} 
