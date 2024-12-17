package poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class Alist {
public static void main(String[] args) {
	List<String> alist = new ArrayList<String>();
	alist.add("Apple");
	alist.add("Orange");
	alist.add("Pulp");
	alist.add("Guva");
	alist.add("Jackfriut");
	System.out.println(alist);
	System.out.println(alist.get(0));
	System.out.println(alist.size());
	alist.set(0, "Pomo");
	System.out.println(alist);
	alist.remove(3);
	System.out.println(alist);
	System.out.println(alist.indexOf("Jackfriut"));
	
	List b= new Vector();
	b.add("Grapes");
	b.add("Dragonfruit");
	b.add("Carrot");
	b.add("Papayaa");
	b.add("Pomo");
	System.out.println(b);
	System.out.println(alist);
	alist.addAll(b);
	System.out.println(alist);
	alist.retainAll(b);
	System.out.println(b);
	
}
}
