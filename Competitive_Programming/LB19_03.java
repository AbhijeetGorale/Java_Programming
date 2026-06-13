//write a program to check number is divisible by 5 and 11 or not

class Logic
{
    void CheckDivisible(int num)
    {
        int iNo = num ; 

        if((iNo % 5 == 0) && (iNo % 11 == 0))
        {
            System.out.println(iNo+" : Number is Divisible by 5 and 11");

        }
        else 
        {
            System.out.println(iNo+" : Number is not divisible by 5 and 11");
        }
    }

}

class LB19_03
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}