import java.io.*;      // folder
import java.util.*;      // write file name and size and then data

class program692
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null ;
        String PackFileName = null;

        FileOutputStream foobj = null ;  
        FileInputStream fiobj = null ;

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

            foobj = new FileOutputStream(fobjpack);



            File fArr[] = fobjFolder.listFiles();     //os.walk

            System.out.println("Number of Files : "+fArr.length);

            for(int i = 0 ; i < fArr.length ; i++)
            {
                int bytedata = 0 ;

                fiobj = new FileInputStream(fArr[i]);


                while((bytedata = fiobj.read()) != -1)
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



