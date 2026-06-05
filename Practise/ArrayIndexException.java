import java.util.*;

class ArrayIndexException
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
                    //  0  1  2  3   4
        int Arr []  = {11,21,51,101,111};

        System.out.println("Enter The Index Of array");

        int Index = sobj.nextInt();

        try
        {
            System.out.println("Inside Try Block");
            System.out.println("Element Of That Index iS  :"+Arr[Index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Exception occured :"+aobj);
        }
        
        System.out.println("End Of Application");
    }
}