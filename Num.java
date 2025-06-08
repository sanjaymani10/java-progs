package object_class;
import java.util.*;

public class Num {
	public static boolean numChecker() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Give Number Only");
		String a= scan.nextLine();
		String b= "";
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>=(int) 48 && a.charAt(i)<=(int) 57) {
			}
			else {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(numChecker());
	}

}
