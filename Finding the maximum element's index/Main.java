import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max;
    if(a[0]>a[1])
      max=0;
    else
      max=1;
    for(int i=2;i<n;i++)
    {
      if(a[max]<a[i])
        max=i;
    }
    System.out.println(max);
  }
}