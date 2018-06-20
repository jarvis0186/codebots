import java.util.*;
public class linkedlist{
  public static void main(String[] args){
    LinkedList<String> ll=new LinkedList<String>();

    for(int i=1; i<=5; i++){
      ll.add("Item"+i);//can add items from a loop directly
    }
    System.out.println("Linked List content: "+ ll);

    ll.addFirst("NewItem1");//adds item at the First
    ll.addLast("NewItem6");//adds item at the last

    System.out.println("New Linked List content: "+ ll);
    Object var = ll.get(0);//gets the first variable
    System.out.println(var);
    ll.set(0, "Changed the first place again");//set places in a ll
    System.out.println(ll);

    ll.removeFirst();//first item is gone
    System.out.println(ll);
    ll.remove(4);//used to remove an element at an index.
    System.out.println(ll);
    ll.removeLast();
    ll.displayList();
  }
}
