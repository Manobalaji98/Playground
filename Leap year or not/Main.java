import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int yr=in.nextInt();
      if(yr%4==0)
        if(yr%100==0)
          if(yr%400==0)
             System.out.println("Leap year");
           else 
              System.out.println("Non Leap year");
         else 
              System.out.println("Non Leap year");
       else 
              System.out.println("Non Leap year");
    }
}