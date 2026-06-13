// write a program to print number from N down to 1 in reverse 

class LB20_02
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}

class Logic
{
    void PrintReverse(int n)
    {
        int iNo = 0 ;
        
        for(iNo = n ; iNo >= 1; iNo--)
        {
            System.out.println(iNo);
        }
    }
}