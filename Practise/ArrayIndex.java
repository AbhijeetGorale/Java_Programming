import java.util.*;

class ArrayIndex
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
                    //  0  1  2  3   4
        int Arr []  = {11,21,51,101,111};

        System.out.println("Enter The Index Of array");

        int Index = sobj.nextInt();

        System.out.println("Element Of That Index iS  :"+Arr[Index]);

        System.out.println("End Of Application");
    }
}