import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int sum=0,n,r;
      n=sc.nextInt();
      while(n>0)
      {
        r=n%10;
        sum+=r;
        n=n/10;
      }
      System.out.println(sum);
	}
}