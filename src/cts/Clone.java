package cts;
import java.util.ArrayList;
import java.util.Arrays;
public class Clone {
public static void main(String[] args) {
	
	ArrayList a=new ArrayList();
	a.add("anjali");
	a.add("sailaja");
	a.add("lasya");
	System.out.println(a);
	 a.clone();
	System.out.println(a);
	System.out.println(a.contains("bjjhnfa"));
	a.ensureCapacity(13);
	a.add("hari");   
	a.add("sridevi");
	a.add("aarya");
	System.out.println(a);     
  Object c = a.get(0);
  System.out.println(c);
  int index=a.indexOf("lasya");
  System.out.println(index);
int d=a.indexOf("anju");
System.out.println(d);
a.add("anjali");
System.out.println(a);
int lastIndex=a.lastIndexOf("anjali");
System.out.println(lastIndex);
			
}
}
