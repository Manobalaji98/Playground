import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
      int s1=sc.nextInt();
      int s2=sc.nextInt();
      int m1,m2,count=0;
      for(int i=0;i<5;i++)
      {
        if(arr[i]==s1)
        {
         // m1=i;
          count++;
          System.out.println(i);
        }
        else if(arr[i]==s2)
        {
         // m2=i;
          count++;
          System.out.println(i);
        }
       }
      if(count!=2)
       System.out.println("-1");
      
        
        
    }
}