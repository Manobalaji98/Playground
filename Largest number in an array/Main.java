import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int large=0;
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if(a[i]>large)
          large=a[i];
      }
      System.out.println(large);
      
    }
}