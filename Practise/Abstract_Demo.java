abstract class Demo
{

    public int i,j ;

    public int Add(int a,int b)
    {
        return a+b ;   //  Method with Boddy (Concrete)
    }

}



class Abstract_Demo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
    }
}