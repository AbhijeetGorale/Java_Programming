import java.io.*;      // folder
import java.util.*;  

class program690 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null ;
        String PackFileName = null;

        System.out.println("Enter Folder Name: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter name of packed file: ");
        PackFileName = sobj.nextLine();

        File fobjFolder = new File(FolderName);

        if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);

            fobjpack.createNewFile();   // packed file gets created 

            File fArr[] = fobjFolder.listFiles();     //os.walk

            System.out.println("Number of Files : "+fArr.length);

            for(int i = 0 ; i < fArr.length ; i++)
            {
                //Logic          
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
} 
