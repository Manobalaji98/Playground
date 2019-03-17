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
      int left=0;
      int right=n-1;
      int is_palindrome=0;
      while(left<right)
      {
        if(a[left]==a[right])
        {
          left++;
          right--;
        }
        else
        {
          is_palindrome=1;
          break;
        }
      }
      if(is_palindrome==0)
        System.out.println("Yes");
      else
         System.out.println("No");
    }
}