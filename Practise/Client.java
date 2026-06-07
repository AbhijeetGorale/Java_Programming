//USer Defined Package import 

import PPA.marvellous;
import PPA.Infosystem;
import PPA.LB.pune;

class Client
{
    public static void main(String A[])
    {
        marvellous mobj = new marvellous();
        Infosystem iobj = new Infosystem();
        pune pobj = new pune();

        System.out.println("Inside main Of Client");


        mobj.fun();
        iobj.gun();
        pobj.sun();
        
    }
}