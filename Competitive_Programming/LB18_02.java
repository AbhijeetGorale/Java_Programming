// write a program to pprint all even nuumber up to n


class Logic
{
    void PrintEvenNumbers(int n)
    {
        int iNo = 0 ;
        for(iNo = 1; iNo <= n ; iNo++)
        {
            if(iNo % 2 == 0)
            {
                System.out.println(iNo);
            }
        }
    }

}
class LB18_02
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(20);
    }
}