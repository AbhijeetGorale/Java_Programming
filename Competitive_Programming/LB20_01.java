// write a program to find the sum of all even number up to N

class LB20_01
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumber(10);
    }
}

class Logic
{
    void SumEvenNumber(int n)
    {
        int iNo = 0 ;
        int iSum = 0 ;

        for(iNo = 1; iNo <= n ; iNo++)
        {
            if(iNo % 2 == 0)
            {
                iSum = iSum + iNo ;
            }
        }
        System.out.println(iSum);
    }
}