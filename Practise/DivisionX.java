import java.util.*;

class DivisionX
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter first Number :");
        No1 = sobj.nextInt();

        System.out.println("Enter seccond Number :");
        No2 = sobj.nextInt();

        Ans = No1 / No2 ;   // Exception Occuredd if devide by 0

        System.out.println("Division is :"+Ans);
    }
}