import javax.swing.*;

class GUIClose          
{
    public static void main(String A[])
    {

        JFrame fobj = new JFrame("Marvellous PPA");

        fobj.setSize(400,300);   // width , height 

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //<---Call to close the frame(Marvellous  Frame) 

    }
}