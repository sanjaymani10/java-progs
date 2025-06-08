package object_class;

public class index {
	public static void main(String[] args) {
		int[]a= {1, 2,3,4,5,6};
		int b=0;
		for (int i=a.length/2; i<a.length;i++) {
			b+=a[i];
			
		}
		System.out.print(b);
	}

}
