
class StringCompare
{
    public static void main(String A[])
    {
        String S1 = "Ganesh" ;   // Pool
        String S2 = new String("Ganesh");  // Heap

        if (S1 == S2)  // compares refrence
        {
            System.out.println("Strings Are Equal");
        }
        else
        {
            System.out.println("Strings Are Not Equal");
        }

       
    }
}