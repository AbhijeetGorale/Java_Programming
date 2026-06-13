// write a program to find the largest digit in given number

class LB20_04
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindLargest(83429);
    }
}

class Logic
{
    void FindLargest( int num)
    {
        int iDigit = 0 ;
        int iNo = 0 ;

        while(num > 0 )
        {
            iDigit = num % 10 ;

            if(iDigit > iNo)
            {
                iNo = iDigit;
            }
            num = num / 10 ;
        }
        System.out.println("Largest Digit is :"+iNo);
    }
    
    

}