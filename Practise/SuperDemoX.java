class SuperDemoX
{
    public static void main(String A[])
    {
        Derived dobj = new Derived(); 

        dobj.Gun();

    }
}

class Base 
{
    public int  i ;

    public Base(int no)
    {
        System.out.println("Inside Base Constructor");

        this.i=no;
        
    }

    public void  fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class   Derived extends Base
{
    public int i;

    public Derived()
    {
        super(11);  //Explicite call to Base Constructor
        
        System.out.println("Inside  Derived Constructor");
        this.i=51;
    }

    
    public void Gun()
    {
        System.out.println("Inside Gun Of Derived");
        System.out.println("Value of I Of Derived Class  :"+i);
        System.out.println("Value of I Of Parent(Base) Class :"+super.i);
    }
}


