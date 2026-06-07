import PPA.marvellous;

interface circle
{
    // Charactaristics (Public Static Final)
    float pi = 3.14f; 

    //Behaviours(Public Abstract)
    float Area (float Radius);
    float Circumference(float Radius);  //  Methods Without Body 

}

class Marvellous implements circle
{
 // Error Due to Misssing Body Of Area And Circumference
}
class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}