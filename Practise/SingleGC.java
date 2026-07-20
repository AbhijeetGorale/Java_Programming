class SingleGC
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");

        Derived dobj = new Derived();

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.X);
        
        dobj.fun();
        dobj.Gun();

        dobj = null;

        System.gc();

        System.out.println("End Of Main");

    }
}

class Base 
{
    public int  i ;
    public int j;

    public Base()
    {
        System.out.println("Inside Base Constructor");

        this.i=0;
        this.j=0;
    }

    protected void  finalize()
    {
        System.out.println("Inside Finalize Method Of Bsse");
    }

    public void  fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class   Derived extends Base
{
    public int X;

    public Derived()
    {
        System.out.println("Inside  Derived Constructor");
        
        this.X=0;
    }

    protected  void finalize()
    {
        System.out.println("Inside Finalize Method Of Derived");
    }

    public void Gun()
    {
        System.out.println("Inside Gun Of Derived");
    }
}

