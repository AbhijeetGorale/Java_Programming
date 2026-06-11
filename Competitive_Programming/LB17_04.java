//write a program to find minimum of three number 

class Logic
{
    void FindMin(int a, int b,int c)
    {
        if(a < b && b < c)
        {
            System.out.println("minimum number is :"+a);
        }
        else if( b < a)
        {
            System.out.println("minimum number is :"+b);
        }
        else
        {
            System.out.println("minimum number is :"+c);
        }
    }

    
}

class LB17_04 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.FindMin(3,7,2);
    }

     
}