/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        int j, sum=0, curr_sum=0,small=0;
        int[] arr=new int[i];
        int[] temp=new int[i];
        for(j=0; j<i; j++){
            arr[j]=s.nextInt();
        }
       for(j=0; j<i; j++)
            sum=sum+arr[j];
            
    
        for(j=0; j<i; j++){
            for(int k=0; k<i; k++){
                curr_sum=curr_sum+arr[j];
            }
            temp[j]=curr_sum;
            curr_sum=0;
        }
        int t,t1;
    for(j=0; j<i-1; j++){
        if(temp[j]>temp[j+1]){
            t=temp[j];
            temp[j]=temp[j+1];
            temp[j+1]=t;
            t1=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=t1;
        }
    }
    for(j=0; j<i; j++){
        if(temp[j]>sum){
            small=j;
            break;
        }
    }
    System.out.print(arr[small]);
    }
}

