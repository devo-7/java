package java_projelerim;
import java.util.Scanner;
public class carpma {

	public static void main(String[] args) {
		Scanner banu=new Scanner(System.in);
		int s1,s2,t=0,i;
		System.out.println("1 sayi gir:");
		s1=banu.nextInt();
		System.out.println("2 sayi gir:");
		s2=banu.nextInt();
		for(i=0;i<s2;i++) {
			t=t+s1;
		}
		System.out.println("sonuc:"+t);
	}
}
