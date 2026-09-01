import java.io.*;      // folder
import java.util.*;  

class program690 
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null ;
        String PackFileName = null;

        FileOutputStream foobj = null ;  
        FileInputStream fiobj = null ;

        System.out.println("Enter Source Folder Name: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter name of Destination packed file: ");       // file in which all data from source folders files will get copy
        PackFileName = sobj.nextLine();

        File fobjFolder = new File(FolderName);

        if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);

            fobjpack.createNewFile();   // packed file gets created 

            foobj = new FileOutputStream(fobjpack);



            File fArr[] = fobjFolder.listFiles();     //os.walk

            System.out.println("Number of Files : "+fArr.length);

            for(int i = 0 ; i < fArr.length ; i++)
            {
                int bytedata;
                
                fiobj = new FileInputStream(fArr[i]);

                // loop to read from fioobj and write to foobj

                while((bytedata = fiobj.read()) != -1 )
                {
                    foobj.write(bytedata);
                }
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
} 
