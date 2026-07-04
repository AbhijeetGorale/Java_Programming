class Demo extends Thread
    {
        public void run()
        {
            int i = 0;
            for (i = 1;  i <= 100; i++)
            {
                System.out.println("Inside Run Method of :"+Thread.currentThread().getName()+" : "+i);
            }
            
        }
    }

class MultiThreadingLoopJoin
{

    public static void main(String A[]) throws Exception
    {

        System.out.println("main Thread is running");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();  // wait until Thread ends

        System.out.println("End Of Main Thread");

        
    }
}