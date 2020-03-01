package collect1;

import java.util.List;

public class CustomImpl {

	   public static void main(String[] args) {
	        try{
	      String s[]={"HELLO", "EVERYONE", "WELCOME","TO","MY","COLLECTIONLIST"};
	      Object o;
	      int i=0;
	      MyClass a= new MyClass();
	      List lst=a.myList(s);
	      System.out.println("The list is: "+lst);
	      ArrayList al=new ArrayList(s);
	      o=al.get(5);
	      System.out.println("The retrieved element is: "+o);
	      String s1="COSTUMECOLLECTIONLIST";
	      o=al.set(5,s1);
	      System.out.println("The set element in place of COLLECTIONLIST is: "+s1);
	      System.out.println("Now the new list is: "+lst);
	      i=al.size();
	      System.out.println("The size of the array list is: "+i);
	      }
	      catch(Exception e){}
	    }
}
