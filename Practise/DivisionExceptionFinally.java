import java.util.*;  

class DivisionExceptionFinally  // Exception Handling
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter first Number :");
        No1 = sobj.nextInt();

        System.out.println("Enter seccond Number :");
        No2 = sobj.nextInt();

        try 
        {

            System.out.println("Inside Try block");
            Ans = No1 / No2 ;   
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Inisde Catch block");
            System.out.println("ExceptionOccured :"+aobj);
        }
        catch(Exception eobj)    
        {
            System.out.println("Inside Generic Catch:"+eobj);
        }
        finally
        {
            System.out.println("Inside Finally Block");
            
            sobj = null;  // Resoure Deallocation
            System.gc();
        }

        System.out.println("Division is :"+Ans);
    }
}