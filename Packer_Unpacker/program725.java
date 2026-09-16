import java.io.*;      
import java.util.*;      // write file name and size and then data

class program725
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null ;
        String PackFileName = null;
        String header = "";

        FileOutputStream foobj = null ;  
        FileInputStream fiobj = null ;
        int iRet = 0 ;
        int Size = 0 ;
        int i = 0 , j = 0 ;

        

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

            for(i = 0 ; i < fArr.length ; i++)
            {
                
                fiobj = new FileInputStream(fArr[i]);

                header = header +fArr[i].getName();
                header = header + " ";
                header = header + fArr[i].length();

                System.out.println("Header is :"+header);

                Size =  100 - header.length();

                for(j = 1 ; j <= Size ; j++)
                {
                    header = header + " " ;
                }

                System.out.println("HEader length :"+header.length());


                // while((iRet = fiobj.read(Buffer)) != -1)
                // {
                //     foobj.write(Buffer,0,iRet);
                // }

                fiobj.close();
                header = "";
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



