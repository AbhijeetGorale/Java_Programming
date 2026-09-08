import java.io.*;      
import java.util.*;      // write file name and size and then data

class program694
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null ;
        String PackFileName = null;

        FileOutputStream foobj = null ;  
        FileInputStream fiobj = null ;
        int iRet = 0 ;

        System.out.println("Enter Folder Name: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter name of packed file: ");
        PackFileName = sobj.nextLine();

        File fobjFolder = new File(FolderName);

        if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);

            fobjpack.createNewFile();   

            foobj = new FileOutputStream(fobjpack);



            File fArr[] = fobjFolder.listFiles();     //os.walk

            System.out.println("Number of Files : "+fArr.length);

            byte Buffer[] = new byte[1024];

            for(int i = 0 ; i < fArr.length ; i++)
            {
                
                fiobj = new FileInputStream(fArr[i]);

                System.out.println(fArr[i].getName());

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                fiobj.close();
            }
            foobj.close();
            sobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
} 



