package object_class;

public class Avgg {
public static void main(String[] args) {
	int a []= {1,2,3,4,5,6};
	int b=a[0];
	for(int i =a.length/2;i<a.length;i++) {
		
		b+=a[i]/a.length;
	}
	System.out.println(b);
}
}
