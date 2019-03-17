import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int sum=0,sum1=0;
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=0;i<=n/2;i++)
      sum+=a[i];
    for(int j=n/2;j<n;j++)
      sum1+=a[j];
    if(sum==sum1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}

