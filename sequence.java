import java.util.Scanner;

public class sequence
{
  public static void main(String[] args)
  {
       long n, i=1, sum=0, modu=0;
       Scanner key= new Scanner(System.in);
       n=key.nextLong();
       for(long k=1; k<n; k++)
       {
         sum=sum+i;
         i=sum;
         if(i>10)
         {
           i=mod(i);

         }

       }
       System.out.println("The\t"+n+"th value is\t"+sum);
  }
  public static long mod(long x)
  {
    if(x!=0)
    {
      return(x%10+mod(x/10));
    }
    else
    return 0;
  }
}

