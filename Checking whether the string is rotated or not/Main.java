import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String str1=new String(str);
      str1=str1.concat(str);
      String str2=sc.nextLine();
      if(str1.contains(str2)==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
