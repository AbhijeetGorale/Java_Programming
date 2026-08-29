// write a porgram to count how many even and odd number are present between 1 and N

class LB21_02
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountEveOddRange(234);
    }
}

class Logic
{
    void CountEveOddRange(int n)
    {
    
        int iEvenCount = 0;
        int iOddCount = 0;
        int iCnt = 0 ;

        for( iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
                iEvenCount++;
            else
                iOddCount++;
        }

        System.out.println("Even count : " + iEvenCount);
        System.out.println("Odd count  : " + iOddCount);

    }
        
        
}