import java.util.Scanner;
class DynamicMemoryIO

{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;
        int i = 0;

        System.out.println("Enter Number OOf Elements");

        Size = sobj.nextInt();

        //Dynamic Memory Allocation

        float Marks [] = new float[Size];

        //Use the Memory

        System.out.println("Enter Your Marks");

        for(i = 0; i < Size; i++)
        {
            Marks[i] = sobj.nextFloat();
        }

        System.out.println("Entered Marks Are");

        for(i = 0; i < Size; i++)
        {
            System.out.println(Marks[i]);
        }

        //Deallocation Of Memory(optional)
        Marks = null;

        System.gc();
        
    }
} 
