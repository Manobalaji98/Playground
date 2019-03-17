import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int num[]=new int[10];
    for(int i=0;i<10;i++)
      num[i]=0;
    int des_idx=0;
    for(int i=0;i<n;i++)
    {
      des_idx=a[i];
      num[des_idx]++;
    }
    int max=0;
    int max_idx=0;
    for(int i=0;i<10;i++)
    {
      if(max<num[i])
      {
        max=num[i];
        max_idx=i;
      }
    }
    System.out.println(a[max_idx]);
  }
}