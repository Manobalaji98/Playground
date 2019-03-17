import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int gcd=gcd_of_3(n1,n2,n3);
      System.out.println(gcd);
      
	}
  public static int gcd_of_3(int m1,int m2,int m3)
  {
    int vgcd,fgcd,min1,min2;
    if(m1>m2)
      min1=m2;
    else
      min1=m1;
    while(min1>=1)
    {
      if(m1%min1==0 && m2%min1==0)
      {
        vgcd=min1;
        break;
      }
      else 
        min1--;
    }
    
    if(min1>m3)
      min2=m3;
    else
      min2=min1;
    while(min2>=1)
    {
      if(min1%min2==0 && m3%min2==0)
      {
        fgcd=min2;
        break;
      }
      else 
        min2--;
    }
    return min2;
  }
}