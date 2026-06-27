
class Marvellous
{
    public Marvellous()
    {
        System.out.println("inside constructor");
    }

    protected void finalize()
    {
        System.out.println("inside finalize method");   
    }
}

class FinalizeDemo
{
    public static void main(String A [])
    {
        Marvellous mobj = new Marvellous();

        mobj = null;
        System.gc();

        System.out.println("end of main");
        
    } 
}