import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String repl=sc.nextLine();
      String expect=sc.nextLine();
      if(str.contains(repl)==true)
      {
        String str1=str.replace(repl,expect);
        System.out.println(str1);
      }
    }
}