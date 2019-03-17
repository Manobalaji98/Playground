import java.util.Scanner;
public class Main
{
  public static void main(String a[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    while(n>100)
    {
      n=n/10;
      count++;
    }
    int s=n%10;
    System.out.println(s);
  }
}