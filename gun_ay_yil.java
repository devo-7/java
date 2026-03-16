package java_projelerim;
import java.util.Scanner;
public class gun_ay_yil {

	public static void main(String[] args) {
		Scanner anvar=new Scanner(System.in);
		int yil,ay,gun,yyil,yay,ygun;
		while(true) {
			System.out.println("Gun giriniz:");
			gun=anvar.nextInt();
			if (gun>30||gun<0) {
				System.out.println("Lutfen gecerli gun giriniz");
			}
			else {break;}
		}
		while(true) {
			System.out.println("Ay giriniz:");
			ay=anvar.nextInt();
			if (ay>12||ay<0) {
				System.out.println("Lutfen gecerli ay giriniz");
			}
			else {break;}
		}
		while(true) {
			System.out.println("Yil giriniz:");
			yil=anvar.nextInt();
			if (yil>2026||yil<0) {
				System.out.println("Lutfen gecerli yil giriniz");
			}
			else {break;}
		}
		ygun=gun+1;
		yay=ay;
		yyil=yil;
		 if (ygun == 31) {
	            ygun = 1;
	            yay++;
	            if (yay == 13) {
	                yay = 1;
	                yyil++;
	            }
	        }
		System.out.println("Ertesi gun:"+ygun+"/"+yay+"/"+yyil);
	}

}