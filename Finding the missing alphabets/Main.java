import java.util.*;
public class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
     // StringBuilder str=new StringBuilder(sb);
      int stat[]=new int[26];
      for(int i=0;i<26;i++)
        stat[i]=0;
      for(int i=0;i<str.length();i++)
      {
        if((str.charAt(i))>='a' && (str.charAt(i))<='z')
        {
          int offset=str.charAt(i)-'a';
          stat[offset]++;
        }
        else if((str.charAt(i))>='A' && (str.charAt(i))<='Z')
        {
          int offset=str.charAt(i)-'A';
          stat[offset]++;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(stat[i]==0)
        {
          //char f=(char)(i+'a');
          char ch=(char)(i+'a');
         // char ch1=(char)(ch+i);
          System.out.print(ch+" ");
        }
      }
    }
}