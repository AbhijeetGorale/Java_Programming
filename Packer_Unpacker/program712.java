class program712
{
    public static void main(String A[]) 
    {
      String header = "India  is  my  country" ;

      header = header.trim(); // start end space

      header = header.replaceAll("\\s+", " "); // middle space

       String Arr[] = header.split(" ");   

       System.out.println("Number of words are :"+Arr.length);

       for(int i = 0; i < Arr.length ; i++)
       {
            System.out.println(Arr[i]);
       }
    }

}