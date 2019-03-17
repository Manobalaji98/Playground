import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      n=square(n);
      System.out.println(n);
	} 
   public static int square(int m)
   {
     int res=m*m;
     return res;
   }
}