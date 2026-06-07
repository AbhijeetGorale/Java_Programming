interface circle
{
    // Charactaristics 
    float pi = 3.14f;  // By default Public Static Final

}

class DemoInterface
{
    public static void main(String A[])
    {
        System.out.println(circle.pi);
        circle.pi = 7.12f;  // Error DUe to Final 
    }
}