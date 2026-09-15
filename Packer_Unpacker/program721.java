class program721
{
    public static void main(String A[]) 
    {
      String header = "A.txt 10" ;

       System.out.println("Actual header length :"+header.length());
       
       System.out.println("Number of white spaces we need :"+(100 -header.length())); 

       int Size = 100 - header.length();
       
       System.out.println("Size variable :"+Size);
       for(int i = 1 ; i <= Size; i++ )
       {
            header = header + " " ;
            System.out.println(i);
       }

       System.out.println("updated header length is :"+header.length());
    }

}