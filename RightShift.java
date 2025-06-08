package object_class;
import java.util.*;

public class RightShift {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Size of Array");
		int size= scan.nextInt();
		int[] arr= new int[size];
		System.out.println("Enter no. of right Shifts");
		int shift= scan.nextInt();
		System.out.println("Enter Elements");
		for(int i=0; i<size; i++) {
			arr[i]= scan.nextInt();
		}
		int[]c= new int[size];
		for (int i=0; i<shift; i++) {
			for (;shift>=size;) {
				shift-=size;
			}
			if (shift==0) {
				for(i=0; i<size; i++) {
				c[i]=arr[i];
				}
			}
			else {
				c[i]=arr[size-shift+i];
			}
			
		}
		
		for(int i=0; i<=size; i++) {
			if(i+shift<size) {
				c[i+shift]=arr[i];
			}
			
		}
		for(int i=0; i<size; i++) {
			System.out.println(c[i]);
		}
		scan.close();
		}
	}

