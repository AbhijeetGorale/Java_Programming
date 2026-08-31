import java.io.*;      // file outputString use to write in byte
import java.util.*;  

class program684   
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FnameSrc = null;
        String FnameDest = null ;

        File fobjSrc = null ;
        File fobjDest = null ; 

        int iRet = 0 ;

        FileInputStream fiobj =  null ;
        FileOutputStream foobj = null ;

        System.out.println("Enter Source file name :");
        FnameSrc = sobj.nextLine();

        System.out.println("Enter Destination file name :");
        FnameDest = sobj.nextLine();

        fobjSrc = new File(FnameSrc);
        fobjDest = new File(FnameDest);

        fiobj  = new FileInputStream(fobjSrc);  // read
        foobj = new FileOutputStream(fobjDest); // write

        fobjDest.createNewFile();


        byte Buffer [] = new byte[100];

        if(fobjSrc.exists())
        {
           String str = null ;
           
           while((iRet = fiobj.read(Buffer)) != -1) 
           {
                foobj.write(Buffer,0,iRet);  

           }
           fiobj.close();
           foobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
} 
