class Demo extends Thread
    {
        public void run()
        {
            System.out.println("Inside Run Method of :"+Thread.currentThread().getName());
        }
    }

class MultiThreadingName
{

    public static void main(String A[])
    {

        System.out.println("main Thread is running");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        
    }
}