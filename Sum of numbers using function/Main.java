import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      n=sum_of_no(n);
      System.out.println(n);
	}
   public static int sum_of_no(int m)
   {
     int res=0;
     for(int i=1;i<=m;i++)
     {
       res+=i;
     }
     return res;
   }
}