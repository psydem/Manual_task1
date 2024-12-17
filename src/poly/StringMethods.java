package poly;

public class StringMethods {
private static String[] split;

public static void main(String[] args) {
	String a= "Hi there";
	System.out.println(a.length());
	String b= "Hi there";
	System.out.println(b.equals(a));
	String c= "hI there";
	System.out.println(c.equalsIgnoreCase(a));
	String d= "Sky ";
	System.out.println(d.toUpperCase());
	String e= "FLY AWAY";
	System.out.println(e.toLowerCase());
	String a1= "Manibaala";
	System.out.println(a1.startsWith("M"));
	System.out.println(b.endsWith("e"));
	System.out.println(c.contains("I"));
	System.out.println(a1.indexOf("l"));
	System.out.println(a1.lastIndexOf("a"));
	System.out.println(e.charAt(2));
	String f= a.replace("i", "eelo");
	System.out.println(f);
	System.out.println(b.substring(2));
	String b1="";
	System.out.println(b1.isEmpty());
	String[] s = e.split(" ");
	for(String X: s)
	{
		System.out.println(X);
	}
	String t= "  Oh God";
	System.out.println(t.trim());
	String r= "Mani";
	String r1= "BaalaKrishnan";
	System.out.println(r.concat(r1));
	int c1= 24;
	System.out.println(String.valueOf(c1));
	System.out.println(a.compareTo(a1));
}
}
