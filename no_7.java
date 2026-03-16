package java_projelerim;
import java.util.Scanner;
public class no_7 {

	public static void main(String[] args) {
		Scanner oku=new Scanner(System.in);
		int s,s2,s3,t=0;
		while(true) {
			System.out.println("Tek basamakli sayi giriniz");
			s=oku.nextInt();
			if(s>9||s<0) {
				System.out.println("Lutfen tek basamakli sayi gir:");
			}
			else {break;}
		}
		s2=s;
		s3=s2;
		t=s3+s2+s;
		System.out.println("sonuc:"+s3+s2+s);
	}

}
