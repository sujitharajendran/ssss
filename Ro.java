package guvi;
import java.util.Scanner;
public class Ro {
	public static void main(String[] args) {
		  String start = "hello world";
		    StringBuffer sbs = new StringBuffer();
		   for (String ss : start.split(" ")) {
		    sbs.append(Character.toUpperCase(ss.charAt(0)));
		     if (ss.length() > 1) {
		         sbs.append(ss.substring(1, ss.length()).toLowerCase());
		      }
		    }
		   System.out.println("given string ' hello world' ");
		System.out.println(sbs);
	}
}
	  
	   
