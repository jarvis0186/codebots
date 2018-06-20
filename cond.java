public class cond{
  public static void main(String[] args){
    int randNumber= (int)(Math.random()*50);
    if(randNumber<25){
      System.out.println("The random number is less than 25. ");

    }
    else if(randNumber>40){
      System.out.println("The random number is greater than 40. ");
    }
    else if(randNumber==18){
      System.out.println("The number is equal to 18");

    }
    else if(randNumber!=40){
      System.out.println("The random number is not equal to 40 ");
    }
    else{
      System.out.println("nothing worked!");
    }
    System.out.println("The number is: "+randNumber);
    int val1=1;
    int val2=2;
    int bigval=(val1>val2)?val1:val2;
    System.out.println("The bigger among the two values are: "+bigval);
  }
}
