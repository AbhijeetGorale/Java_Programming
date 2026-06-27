import javax.swing.*;
import java.awt.event.*;

class GUIButtonListner   
{
    public static void main(String A[])
    {

        JFrame fobj = new JFrame("Marvellous PPA");
        
        JButton bobj = new  JButton("OK");

        bobj.setBounds(100,100,150,50);  //X,Y,WIDTH,Height

        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button Clicked");
            }
        });
        fobj.add(bobj);


        fobj.setSize(400,300);   // width , height
        
        fobj.setLayout(null);

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}