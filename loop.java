import java.util.*;
public class loop{
  static Scanner input=new Scanner(System.in);
  public static void main(String[] args){
    int i = 1;
    while(i<=20){
      if(i == 3){
        i+=2;
        continue;
      }
      System.out.println(i);
      i++;
      if((i%2)==0){
        i++;
      }
      if(i>10){
        break;
      }
    }
    double myPi=4.0;

    double j = 3.0;
    //4-4/3 + 4/5 -4/7 ....... to get the value of PI.

    while(j < 8001){
      myPi=myPi-(4/j)+(4/(j+2));
      j+=4;

    }
    System.out.println("Value of PT: "+ myPi);
    System.out.println("Actual value of PI: "+ Math.PI);
    String cont="Y";
    int h=1;

    while(cont.equalsIgnoreCase("y")){
      System.out.println(h);
      System.out.println("do u wish to comtinue?");
      cont=input.nextLine();
      h++;
    }
    int  k=10;
    do{
      System.out.println(k);
      k++;
    }while(k<10);
    //for loop
    for(int l=10; l>=1; l--){
      System.out.println(l);
    }
    int m, n;
    for(m=1, n=2; m<=9; m+=2, n+=2){
      System.out.println(m+"\t"+ n);
    }
  }



}
