// write a program to check whether the number is prime or not

class Logic
{
    void CheckPrime(int num)
    {
        int iNo = num ;
        if(iNo % 2 == 0)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }

}

class LB18_01
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}