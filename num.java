

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
            int j=s.nextInt();
            
            int k= (i>j)?i:j;
            int count=0;
            for(int l=1; l<=k/2; l++){
                if((i%l==0)&&(j%l==0)){
                    count++;
                }else continue;
            }
            System.out.println(count);
        }
    }

Language: Java 8

