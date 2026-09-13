import java.util.*;

class program708
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Ener String :");
        str = sobj.nextLine();

        System.out.println("String is :"+str+" having length :"+str.length());

        str = str.trim();      // remove start and end white spaces
        System.out.println("String is :"+str+" having length :"+str.length());

        str = str.replaceAll("\\s+", " ");    // replace all whitespaces with on 

        System.out.println("String is :"+str+" having length :"+str.length());

    }

}