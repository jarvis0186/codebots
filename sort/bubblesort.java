public class bubblesort{
    public void bsort(int[] a){
      int n=a.length;
      for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
          if(a[j]>a[j+1]){
            a[j]=a[j]+a[j+1];
            a[j+1]=a[j]-a[j+1];
            a[j]=a[j]-a[j+1];
          }
        }
      }
    }
  public void printarr(int a[]){
    int k=a.length;
    for(int i=0; i<k;i++){
      System.out.print(a[i]+",");
      if(i==k-1)System.out.println();
    }
  }

  public static void main(String[] args){
    int arr[]={10,5,3,4,2,6};
    bubblesort bs=new bubblesort();
    bs.bsort(arr);
    bs.printarr(arr);
  }

}
