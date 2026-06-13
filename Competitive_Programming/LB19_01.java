// write a program to check wheather a given year is leap year or not

class Logic
{
    void CheckLeapYear(int year)
    {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("its  leap year");
        }
        else
        {
            System.out.println("its not leap year");
        }

        
    }
}

class LB19_01
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}