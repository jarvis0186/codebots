import java.util.*;

class shift_operator {
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        while(n>0){
            long a=Long.parseLong(s.next());
            long b=Long.parseLong(s.next());
            int count=-1;
            if(b%2!=0){
            if(b==1){
                System.out.println("(2<<0)");

            }
            else{
                System.out.println("(2<<"+(b-2)+") + (2<<0)");
            }

            }
            else{
                while(b>1){
                    b=b/2;
                    count++;
                    if(b==2){
                        System.out.println("(2<<"+count+")");
                        continue;
                    }
                    else if(b%2!=0){
                        long c=b/2;
                        System.out.println("(2<<"+(c+1)+") + (2<<"+c+")");
                        continue;
                    }


                }
            }
            n--;
        }

    }
}
