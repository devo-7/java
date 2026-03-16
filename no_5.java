package java_projelerim;
import java.util.Scanner;
public class no_5 {

	public static void main(String[] args) {
		Scanner aziz=new Scanner(System.in);
		int s,yuz;
		System.out.println("5 basamakli sayi gir:");
		s=aziz.nextInt();
		yuz=(s/100)%10;
		System.out.println(yuz);
	}

}
