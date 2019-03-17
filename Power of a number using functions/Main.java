import java.util.Scanner;
class Main
{
  public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    int res=power(b,e);
    System.out.println(res);
  }
  public static int power(int n,int m)
  {
    int ans=1;
    for(int i=1;i<=m;i++)
    {
      ans=ans*n;
    }
    return ans;
  }
}