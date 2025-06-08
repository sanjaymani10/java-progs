package object_class;
import java.util.*;

public class MsgMod {
	boolean msgMod(String str) {
		String[] a= {"bad", "hate", "ugly"};
		for(String b:str.split(" ")) {
			for (int i=0; i<a.length;i++) {
				if(a[i].equalsIgnoreCase(b)) {
					return true;
				}
					
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String");
		String str= s.nextLine();
		str.trim();
		s.close();
		
		MsgMod obj= new MsgMod();
		System.out.println(obj.msgMod(str));
	}

}
