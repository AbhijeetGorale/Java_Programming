
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

class FinalizeDemoX
{
    public static void main(String A [])
    {
        Marvellous mobj = new Marvellous();

        Marvellous mobj2 = mobj ;

        mobj = null;
        System.gc();

        System.out.println("end of main");
        
    } 
}