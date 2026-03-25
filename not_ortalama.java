package java_projelerim;
import java.util.Scanner;
public class not_ortalama {

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		int q,v,o,f,s;
		while(true) {
			System.out.println("Quiz notunu gir:");
			q=oku.nextInt();
			if (q>100||q<0) {
				System.out.println("Yanlis sayi");
			}
			else {break;}
		}
		while(true) {
			System.out.println("Odev notunu gir:");
			o=oku.nextInt();
			if (o>100||o<0) {
				System.out.println("Yanlis sayi");
			}
			else {break;}
		}
		while(true) {
			System.out.println("Vize notunu gir:");
			v=oku.nextInt();
			if (v>100||v<0) {
				System.out.println("Yanlis sayi");
			}
			else {break;}
		}
		while(true) {
			System.out.println("Final notunu gir:");
			f=oku.nextInt();
			if (f>100||f<0) {
				System.out.println("Yanlis sayi");
			}
			else {break;}
		}
		q=q*15/100;
		o=o*15/100;
		v=v*30/100;
		f=f*40/100;
		s=q+o+v+f;
		System.out.print("Notunuz:"+s);
		}
}
