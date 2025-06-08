package object_class;
import java.util.*;

public class Rev {
	public static boolean checker() {
		Scanner scan= new Scanner(System.in);
		System.out.println("give string");
		String a= scan.nextLine();
		String temp= "";
		String rev= "";
		a=a.toLowerCase();
		
		for (int i= a.length()-1; i>=0 ;i--) {
			if (a.charAt(i)>=97 && a.charAt(i)<=123) {
				rev+=a.charAt(i);
			}
		}
		
		for (int i= 0; i<a.length(); i++) {
			if (a.charAt(i)>=97 && a.charAt(i)<=123) {
				temp+=a.charAt(i);
			}
		}
		scan.close();
		
		return temp.equals(rev);
	}
	public static void main(String[] args) {
		System.out.println(checker());
	}
}
