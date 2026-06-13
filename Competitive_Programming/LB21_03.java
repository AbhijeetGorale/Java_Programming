// write a program to display all factor of given number

class LB21_03
{
    public static void main(String A[])
    {
        Logic lobj = new  Logic();
        lobj.DisplayFactors(12);
    }
}

class Logic
{
    void DisplayFactors(int num)
    {
        int iCnt =0 ;
        for( iCnt = 1 ; iCnt <= num ; iCnt++)
        {
            if( num % iCnt ==0 )
            {
                System.out.println(iCnt);
            }
        }
    }
}