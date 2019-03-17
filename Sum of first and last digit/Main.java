import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int l=n%10,count=0;
      while(n>10)
      {
        n=n/10;
        count++;
      }
     
        int sum=n+l;
        System.out.println(sum);
      
	}
}