import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int c=1,c1=0;
      for(int i=0;i<n-1;i++)
      {
        
        if(a[i]==1 && a[i+1]==1)
        {
          c++;
        }
        else if(a[i]==0 && a[i+1]==0)
          break;
        else if((a[i]==1 && a[i+1]==0) || (a[i]==0 && a[i+1]==1))
          c1++;
      }
      System.out.println(c);
    }
}