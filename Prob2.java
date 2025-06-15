/*Create an integer array where an element is said to be leader if it is
 *larger than all of it right elements, then return the value of those 
 *integers that are leaders 
 */

package leet;
import java.util.*; 

public class Prob2 {
	static String res(int a[]) {
		String leader="";
		int count=0;
		for(int i=a.length-1; i>=0; i--) {
			for(int j=i+1; j<a.length; j++) {
				if (a[i]>a[j]) {
					count++;
				}
			}
			if (count==a.length-1-i) {
				leader+=a[i]+" ";
			}
			count=0;
		}
		return leader;
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int size= scan.nextInt();
		int[] a= new int[size];
		for(int i=0; i<size; i++) {
			a[i]= scan.nextInt();
		}
		scan.close();
		
		System.out.println(res(a));
	}

}
