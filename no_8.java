package java_projelerim;

public class no_8 {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		for (int i=1;i<=100;i++) {
			if (i%3==0) {
				System.out.println("3e bolunen"+i);
				a++;
			}
			if(i%5==0) {
				System.out.println("5e bolunen:"+i);
				b++;
			}
			if (i%3==0&&i%5==0) {
				System.out.println("her ikisine bolunen:"+i);
				c++;
			}
		}
		System.out.println("3e bolunenler toplami:"+a);
		System.out.println("5e bolunenler toplami:"+b);
		System.out.println("her ikisine bolunenler toplami:"+c);
	}
}