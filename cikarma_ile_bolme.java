package java_projelerim;
import java.util.Scanner;
public class cikarma_ile_bolme {

	public static void main(String[] args) {
		Scanner guga=new Scanner(System.in);
		int a,b,c=0,i=0;
		System.out.println("1 sayi gir:");
		a=guga.nextInt();
		System.out.println("2 sayi gir:");
		b=guga.nextInt();
		while(a>=b) {
			a=a-b;
			i++;
		}
		while(a<b) {
			System.out.println("yanlis sayi girdiniz");
			break;
		}
		System.out.println("kalan sayi:"+a);
		System.out.print(i+"-kere bolundu");
		
	}
}
