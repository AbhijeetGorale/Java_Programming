// write aprogram to check wheather a number is  palindrome or not
// number 121
// output - number is palindrome 

class LB17_02
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);
    }
}

class Logic
{
    void CheckPalindrome(int num)
    {
        int iCnt =num;
        int iNo = 0;

        while( num > 0)
        {
            iNo = iNo * 10 +(num %10);
            num = num / 10 ;
        }

        if(iCnt == iNo)
        {
            System.out.println("Number is paliindrome ");
        }
        else
        {
            System.out.println("Number is not palindrome ");
        }
    }
}

