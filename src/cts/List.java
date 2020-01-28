package cts;

import java.util.ArrayList;

public class List {
public static void main (String[] args) {
	ArrayList list1= new ArrayList();
	list1.add("Anjali");
	list1.add("lasya");
	list1.add("ramani");
	
	ArrayList<String> list2=new ArrayList<>();
list2.add("hari");        // adding generic elements into list//
list1.addAll(list2);
list1.remove("Anjali");
System.out.println(list1);

	}
}
