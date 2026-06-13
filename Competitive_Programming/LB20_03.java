// write a program to check wheather a number is perfect or not

class LB20_03
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}


class Logic
{
    void CheckPerfect(int num)
    {
        int iNo = 0 ;
        int iSum = 0 ;

        for(iNo = 1 ; iNo < num ; iNo++)
        {
            if(num % iNo == 0)
            {
                iSum = iSum + iNo ;
            }
        }
        if(iSum == num)
        {
            System.out.println("number is perfect");
        }
        else
        {
            System.out.println("number is not perfect");
        }
    }
}