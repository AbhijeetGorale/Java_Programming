//writea program to find the sum of even and odd Digit Separately in a a number

class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iEven = 0;
        int iOdd = 0;
        int iDigit = 0 ;

        while(num !=0)
        {
            iDigit = num % 10 ;
            if(iDigit % 2 == 0)
            {
                iEven = iEven +iDigit ;
            }
            else
            {
                iOdd = iOdd + iDigit ;
            }
            num = num / 10 ;
        }
        System.out.println("Addition of Even :"+iEven);
        System.out.println("addition of Odd is :"+iOdd);
    }

}

class LB18_04
{
    public static void main(String A [])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}