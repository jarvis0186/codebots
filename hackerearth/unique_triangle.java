import java.util.*;

class unique_triangle {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        int side[]=new int[3];
        int sum[]=new int[n];
        int sum1=0, j=0, count=n, c=0;
        while(n>0){
            for(int i=0; i<3; i++){
                side[i]=Integer.parseInt(s.next());
                sum1=sum1+side[i];
                sum[j]=sum1;

            }
            sum1=0;
            j++;
            n--;
        }
        for(int i=0; i<count; i++){
            for(int k=1; k<count; k++){
                if(sum[i]==sum[k]){
                    c++;

                }
                sum[k]=0;
            }


        }
        count=count-(c+c);
        System.out.print(count);
    }
}
