public class mergesort{
  public void merge(int [] a, int l, int m , int r){
    int [] a1= new int[m-l+1];
    int [] a2= new int[r-m];

    for(int i=0; i<(m-l+1); i++){
      a1[i]=a[l+i];
    }
    for(int i=0; i<(r-m); i++){
      a2[i]=a[m+i+1];
    }
    int i=0, j=0, k=l;
    while(i<(m-l+1)&&j<(r-m)){
      if(a1[i]<a2[j]){
        a[k]=a1[i];
        i++;
      }
      else{
        a[k]=a2[j];
        j++;
      }
      k++;
    }
    while(i<(m-l+1)){
      a[k]=a1[i];
      i++;
      k++;
    }
    while(j<(r-m)){
      a[k]=a2[j];
      j++;
      k++;
    }
  }

  public void sort(int[] a, int l, int r){
    if(l<r){
      int m= (l+r)/2;

      sort(a, l, m);
      sort(a, m+1, r);

      merge(a, l, m, r);
    }
  }
  void print(int[] arr){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+",");
    }System.out.println();
  }
  public static void main(String[] args){
  int arr[]={4,7,1,3,20, 10};
  mergesort ms= new mergesort();

  ms.sort(arr, 0, arr.length-1);
  ms.print(arr);
}
}
