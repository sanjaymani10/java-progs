package object_class;
import java.util.*;

public class LongDet {
	String Longword(String str) {
		str=str.trim();
		int a=0;
		String fin="";
		for(String s:str.split(" ")) {
			s=s.trim();
			if(s.length()>a) {
				a=s.length();
				fin=s;
			}
		}
		return fin;
		
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your msg");
		String str=s.nextLine();
		s.close();
		
		LongDet obj= new LongDet();
		System.out.println(obj.Longword(str));
	}

}
