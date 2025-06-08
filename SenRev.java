package object_class;
import java.util.*;

public class SenRev {
	String Rev(String str) {
		String rev="";
		for(String s:str.split(" ")) {
			s=s.trim();
			rev=rev.trim();
			rev= String.join(" ",s, rev);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Give a Sentence to Reverse");
		String str= s.nextLine();
		s.close();
		
		SenRev obj= new SenRev();
		System.out.println(obj.Rev(str));
	}

}
