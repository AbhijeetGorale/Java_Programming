// write a program to find smallest digit in given number

class LB20_05
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallest(83429);
    }
}

class Logic
{
    void FindSmallest( int num)
    {
        int iDigit = 0 ;
        int iNo = 9 ;

        while(num > 0 )
        {
            iDigit = num % 10 ;

            if(iDigit < iNo)
            {
                iNo = iDigit;
            }
            num = num / 10 ;
        }
        System.out.println("smallest Digit is :"+iNo);
    }
    
    

}