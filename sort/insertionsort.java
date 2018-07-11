public class insertionsort{
  public void sort(int[] a){
    for(int i=1; i<a.length; i++){
      int key=a[i];
      int j=i-1;
      while(j>=0 && a[j]>key){
        a[j+1]=a[j];
        j=j-1;
      }
      a[j+1]=key;
    }
  }
  void print(int [] a){
    for(int i=0; i<a.length; i++){
      System.out.print(a[i] + ",");
}System.out.println();
  }

  public static void main(String [] args){
    int arr[]={10,3,2,11,7};
    insertionsort is= new insertionsort();
    is.sort(arr);
    is.print(arr);
  }
}
