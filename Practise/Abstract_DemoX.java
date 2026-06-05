abstract class Demo
{

    public int i,j ;

    public int Add(int a,int b)
    {
        return a+b ;   //  Method with Boddy (Concrete)
    }

    public abstract int sub(int a, int b);

}

class Hello extends Demo
{

}



class Abstract_DemoX
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}