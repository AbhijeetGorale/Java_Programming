// write a program to calculate the power of a number using loop

class LB19_05
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);
    }
}

class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iNo = 1 ;
        int iCnt = 0 ;
        
        while( iCnt < exp)
        {
            iNo =  iNo * base;
            iCnt++;
        }
        System.out.println("power is :"+iNo);
    }
}