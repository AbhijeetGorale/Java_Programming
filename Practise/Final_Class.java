final class  Demo
{
    public void fun()
    {
        System.out.println("Inside Demo Fun");
    }

    public void gun()
    {
        System.out.println("Inside Demo Gun");
    }

    
}

class Hello extends Demo   // Error
{
    public void gun()  // Errror
    {
        System.out.println("Inside Hello Gun");
    }
}


class Final_Class
{
    public static void main(String A[])
    {

        Demo dobj = new Demo();  // Allowed
        Hello hobj = new Hello();

    }
}