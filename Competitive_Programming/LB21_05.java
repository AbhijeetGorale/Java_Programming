//write a program to print all number from 1 to n that are divisible by both 2 andd 3

class LB21_05
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PritDivisibleBy2and3(30);
    }

}

class Logic
{
    void PritDivisibleBy2and3(int num)
    {
        int iNo = 0 ;

        for(iNo = 1 ; iNo <= num; iNo++)
        {
            if(iNo % 2 == 0 && iNo % 3 == 0)
            {
                System.out.println(iNo);
            }
        }
    }
}