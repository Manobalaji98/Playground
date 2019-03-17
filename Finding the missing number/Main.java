import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        int is_found=0;
        for(int j=0;j<n;j++)
        {
          if(a[j]==i)
            is_found=1;
        }
        if(is_found==0)
          System.out.println(i);
      }
    }
}