package Dec_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Collection {
	
	public static void main(String [] args) {
		ArrayList <String> list= new ArrayList<String>();
		list.add("Priya Singh");
		list.add("Preeti Singh");
		list.add("Praveen Singh");
		
		list.addAll(list);
//		list.removeAll(list);
//		list.remove(2);
		list.size();
		Iterator itr=list.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List <String> list1= new ArrayList();
		List <String> list2= new LinkedList();
		List <String> list3= new Stack();
		List <String> list4= new Vector();

//Arraylist adding object into arraylist
		System.out.println("***********Array List **********");
	   list1.add("Priyanka");
	   list1.add("Ram");
	   list1.add("Ayan");
//	  list1.addAll(list1);
//	  Collections.sort(list1);
	  Collections.addAll(list1, "Priya", "Riya", "Supriya");
	   Iterator it=list1.iterator();
	   
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   
	   //Add object into LinkedList
	   System.out.println("***********Array List **********");
		list2.add("Maggiee");
		list2.add("Siku");
		list2.add("Maggiee");
		
		  Iterator it1=list2.iterator();
		   
		   while(it1.hasNext()) {
			   System.out.println(it1.next());
		   }
	   
		  // add object into stack
		   list3.add("Scooby");
		   list3.add("Dhayrya");
		   list3.add("kamya");
		   
		   Iterator it3=list3.iterator();
		   
		   
	   
	}

}
