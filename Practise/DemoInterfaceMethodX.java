//import PPA.marvellous;

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
    public float Area (float Radius)
    {
        return circle.pi * Radius * Radius;
    }
    public float Circumference(float Radius)
    {
        return 2 * circle.pi * Radius ;
    }


}
class DemoInterfaceMethodX
{
    public static void main(String A[])
    {

        //circle cobj = new circle() ;  //Eror Not Allowed Creating Object Of Interface class

        Marvellous mobj = new Marvellous();
        float  Ret  = 0.0f ;

        Ret = mobj.Area(10.5f);
        System.out.println("Area Is :"+Ret);

        Ret = mobj.Circumference(10.5f);
        System.out.println("Circumference is :"+Ret);

    }
}