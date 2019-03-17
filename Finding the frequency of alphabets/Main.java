import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
     // StringBuilder str=new StringBuilder(str1);
      int stat[]=new int[26];
      for(int i=0;i<26;i++)
        stat[i]=0;
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
          int offset=str.charAt(i)-'a';
          stat[offset]++;
        }
         else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        {
           char ch=(char)(str.charAt(i)+32);
          int offset=ch-'a';
          stat[offset]++;
        }
      }
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
        if(stat[str.charAt(i)-'a']!=0)
        {
            int j=stat[str.charAt(i)-'a'];
          char ch=str.charAt(i);
          System.out.print(ch+""+j+" ");
          stat[str.charAt(i)-'a']=0;
        }
       }
        else if(str.charAt(i)>='A' && str.charAt(i)<='A')
        {
        if(stat[str.charAt(i)-'A']!=0)
        {
            int j=stat[str.charAt(i)-'A'];
          char ch=(char)(str.charAt(i)+32);
          System.out.print(ch+""+j+" ");
          stat[str.charAt(i)-'A']=0;
        }
       }
      }
    }
}