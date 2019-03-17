import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int arr_size=sc.nextInt();
    int a[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
      a[i]=sc.nextInt();
    int seq[]=new int[2*arr_size];
    int seq_idx=0;
    int start=0;
    for(int i=0;i<arr_size-1;i++)
    {
      if(a[i]>a[i+1])
      {
        seq[seq_idx]=start;
        seq_idx++;
        seq[seq_idx]=i;
        seq_idx++;
        start=i+1;
      }
    }
    if(start==arr_size-1)
    {
      seq[seq_idx]=start;
      seq_idx++;
      seq[seq_idx]=arr_size-1;
      seq_idx++;
    }
    if(start!=arr_size-1)
    {
      seq[seq_idx]=start;
      seq_idx++;
      seq[seq_idx]=arr_size-1;
      seq_idx++;
    }
    int sum=0;
    for(int i=0;i<seq_idx-1;i+=2)
    {
      start=seq[i];
      int end=seq[i+1];
      int sum1=0;
      for(int j=start;j<=end;j++)
      {
        sum1+=a[j];
        
      }
       if(sum<sum1)
             sum=sum1;
    }
    System.out.println(sum);
  }
}