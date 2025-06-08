package object_class;
import java.util.*;

public class Rotate {
	boolean canRotate(String str1, String str2) {
		String temp="";
		for (int j=str1.length()-1; j>=0; j--) {
			for(int i=0; i<=j; i++) {
				System.out.println(temp);
				temp+=str1.charAt(i);
				if(temp.equalsIgnoreCase(str2)) {
					return true;
				}
				if(temp.length()==str1.length()) {
					temp="";
					for(int k=str1.length()-1; k>=j; k--) {
						temp=str1.charAt(k)+temp;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=s.next();
		str1.trim();
		System.out.println("Enter String 2");
		String str2=s.next();
		str2.trim();
		s.close();
		Rotate obj= new Rotate();
		System.out.println(obj.canRotate(str1, str2));
	}
}
