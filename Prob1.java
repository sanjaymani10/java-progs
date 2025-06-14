/*Alex is a high school student who loves to read books. He has a list
 * of books that he wants to read. Each book is having an estimated time
 * to read respectively stored in an array. Alex has n hours available to
 * read books. Your task is to find maximum number of books Alex can study
 * within n hours.
 * Try to use return statement
 * 
 * Test case1:
 *Input:
 * 4 // total no. of books
 * 4 3 1 1// array
 * 5// time available
 * Output:
 * 3// Max no. of books
 */

package leet;
import java.util.*;
public class Prob1 {
	static int Books(int[]a, int size, int time) {
		int count=0;
		int temp=0;
		Arrays.sort(a);
		
		for(int i=0; i<size; i++) {
			temp+=a[i];
			if(temp<=time)
				count++;		
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int size= scan.nextInt();
		int[] a= new int[size];
		for(int i=0; i<size; i++) {
			a[i]= scan.nextInt();
		}
		int time= scan.nextInt();
		scan.close();
		
		System.out.println(Books(a, size, time));
		
	}
	

}
