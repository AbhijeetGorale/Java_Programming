//write a program to count total number of factor of given number 

class LB21_04
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactor(20);
    }
}

class Logic
{
    void CountFactor(int num)
    {
        int iCnt = 0 ;
        int iNo = 1 ;

        for(iNo = 1; iNo <= num ; iNo++)
        {
            if(num % iNo == 0 )
            {
                iCnt++;
            }
        }
        System.out.println("factor count :"+iCnt);
    }
}