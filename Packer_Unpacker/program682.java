import java.io.*;      // file outputString use to write in byte
import java.util.*;  

class program682   
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        File fobj = null ;
        int iRet = 0 ;

        FileInputStream fiobj =  null ;

        System.out.println("Enter file name :");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        fiobj  = new FileInputStream(fobj);


        byte Buffer [] = new byte[50];

        if(fobj.exists())
        {
           String str = null ;
           
           while((iRet = fiobj.read(Buffer)) != -1) 
           {
                //str = new String(Buffer);

                //System.out.print(str);

                //str = null;
                System.out.println(iRet);
           }
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
} 
