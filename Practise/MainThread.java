class MainThread
{
    public static void main(String A[])
    {
        System.out.println("Inside Main Method");


        Thread tobj = Thread.currentThread();

        String name = tobj.getName();  // every function contain atleast one thread 

        System.out.println("Name of Current Thread :"+name);
    }
}