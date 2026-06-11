class Logic
{
    void PrintTable(int num)
    {
        int iNo = 0 ;

        for(iNo = 1 ; iNo <= 10 ; iNo++)
        {
            System.out.println( iNo * num);
        }
    }

}

class LB17_05
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
    }
}