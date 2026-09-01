import java.io.*;      // folder
import java.util.*;  

class program688 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null ;

        System.out.println("Enter Folder Name: ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder exists");

            File fArr[] = fobj.listFiles();     //os.walk

            System.out.println("Number of Files : "+fArr.length);

            for(int i = 0 ; i < fArr.length ; i++)
            {
                System.out.println(fArr[i].getName());        // name of  files 
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
} 
