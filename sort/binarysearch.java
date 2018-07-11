public class binarysearch{
  int binsearch(int [] a, int l, int r, int x){
    if(r>=l){
      int mid=(l+r)/2;

      if(a[mid]==x){
    return mid;
      }
      if(a[mid]>x){
        return binsearch(a, l, mid-1,x);
      }
      return binsearch(a, mid+1, r, x);
    }
    return -1;
  }
  public static void main(String[] args){
    int [] arr={2,4,6,8,10,20};
    binarysearch bs= new binarysearch();
    int x=10;
    int result=bs.binsearch(arr, 0, arr.length-1, x);
    if(result==-1){
      System.out.println("Element not present");
    }
    else
    System.out.println("Element at index"+ result);
  }
}
