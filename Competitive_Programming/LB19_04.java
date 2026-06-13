//  write a program to print each digit of a number separately

class LB19_04
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigit(9876);
    }
}

class Logic
{
    void PrintDigit(int num)
    {
         int iCnt = 1;

        while(iCnt <= num / 10)
        {
            iCnt = iCnt * 10;
        }

        while(num > 0)
        {
            System.out.println(num / iCnt);  
            num = num % iCnt;                
            iCnt = iCnt / 10;
        }
    }

}

