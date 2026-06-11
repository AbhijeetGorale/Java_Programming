//write a program to find sum of a number
// number - 1234
//output - 10

class Logic
{
    void SumOfDigit(int num)
    {
        int iSum = 0 ;

        while(num != 0)
        {
            iSum = iSum + num % 10 ;
            num = num / 10 ;
        }
        System.out.println("Sum oF number is :"+iSum);
    }
}

class LB17_01
{
    public static void main(String A[])
    {
        Logic obj =  new Logic();
        obj.SumOfDigit(1234);
    }
}

