import java.util.*;


public class Deques{

  public static void main(String[] args)
    {
    
    Deque<String> deque=new ArrayDeque<String>();
    
    deque.add("a");
    deque.add("b");
    deque.add("c");
    deque.add("d");
    deque.add("e");
    
    System.out.println("The Queue after inserting the values : ");
    for(String str: deque)
       {
         System.out.println(str+" ");
         }
         
      deque.addFirst("z");
      
      System.out.println("The queue after inserting the element at first : ");
      
      for(String str: deque)
      {
      System.out.println(str+" ");
      }
      
      deque.remove();
       System.out.println("The queue after deleting the element at first : ");
      
      for(String str: deque)
      {
      System.out.println(str+" ");
      }
      
      deque.addLast("x");
      
      System.out.println("The queue after inserting at the last : ");
      
      for(String str: deque)
      {
      System.out.println(str+ " ");
      }
      deque.clear();
      
      deque.add("k");
      
      System.out.println("The queue after clearing and inserting a new element :");
      for(String str: deque)
      {
      System.out.println(str+" ");
      }
      }
      }
