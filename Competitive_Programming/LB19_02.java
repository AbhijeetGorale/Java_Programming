// write a program to display the grade of student based on marks

class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks >= 90)
        {
            System.out.println("grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("grade B");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 35)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("fail");
        }
    }

}

class LB19_02
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}