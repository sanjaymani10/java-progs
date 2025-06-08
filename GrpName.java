package object_class;

import java.util.*;

public class GrpName {
	void Group(String[] arr) {
		String key = "";
		for (int c = 0; c < arr.length; c++) {
			String temp = arr[c];
			key = temp;
			for (int i = c + 1; i < arr.length; i++) {
				if (arr[i].length() == temp.length()) {
					key = key + " " + arr[i];
					arr[i] = "";
				}
			}
			key = key.trim();
			if (key.length() > 0) {
				String[] s = key.split(" ");
				Arrays.sort(s);
				key="";
				for(int i=0; i<s.length; i++) {
					key+=s[i]+" ";
				}
				System.out.print(key);
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of Contacts");
		int size = scan.nextInt();
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.next();
		}
		scan.close();
		GrpName obj = new GrpName();
		obj.Group(arr);
	}

}
