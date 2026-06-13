// write a porgram to calculate the product of digit of number

class LB21_01
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigit(234);
    }
}

class Logic
{
    void ProductOfDigit(int num)
    {
        int iMult = 1 ;

        while(num != 0)
        {
            iMult = iMult * (num % 10);
            num = num / 10 ;
        }
        System.out.println(iMult);
    }
}