//write a program to find maximum of two number 

class Logic
{
    void FindMax(int a, int b)
    {
        
        if(a > b)
        {
            System.out.println("Maximun number is :"+a);
        }
        else
        {
            System.out.println("maximum number is:"+b);
        }
    }
}

class LB17_03
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.FindMax(20,15);
    }
}