import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int max=max_of_3(n1,n2,n3);
      System.out.println(max);
	}
  public static int max_of_3(int m1,int m2,int m3)
  {
    int smax;
    if(m1>m2)
    {
      smax=m1;
    }
    else
    {
      smax=m2;
    }
    if(m3>=smax)
    {
      smax=m3;
    }
    return smax;
  }
}