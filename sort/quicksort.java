public class quicksort{
  int partition(int [] a, int low, int high){
    int pivot=a[high];
    int i=low-1;
    for(int j=low; j<high; j++){
      if(a[j]<=pivot){
        i++;
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
    int temp=a[i+1];
    a[i+1]=a[high];
    a[high]=temp;

    return i+1;
  }

  void sort(int[] a, int low, int high){
    if(low<high){
      int pi=partition(a, low, high);

      sort(a, low, pi-1);
      sort(a, pi+1, high);
    }

  }

  void print(int[] a){
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+",");
    }System.out.println();
  }
  public static void main(String[] args){
      int arr[]={7,10,3,4,2,20};
      quicksort qs= new quicksort();
      qs.sort(arr, 0, arr.length-1);
      qs.print(arr);
  }
}
