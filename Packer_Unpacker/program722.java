class program722
{
    public static void main(String A[]) 
    {
      String header = "Hello.txt 1078" ;

       System.out.println("Actual header length :"+header.length());
       
       System.out.println("Number of white spaces we need :"+(100 -header.length())); 

       int Size = 100 - header.length();
       
       for(int i = 1 ; i <= Size; i++ )
       {
            header = header + " " ;
       }

       System.out.println("updated header length is :"+header.length());
       System.out.println("updated header is :"+header);
    }

}