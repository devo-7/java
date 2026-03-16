package java_projelerim;
import java.util.Scanner;
public class gun_hesaplama {

	public static void main(String[] args) {
		Scanner ikbal=new Scanner(System.in);
		int g,ay,t=0;
		while(true) {
			System.out.println("gun gir:");
			g=ikbal.nextInt();
			if (g>30||g<0) {
				System.out.println("yanis sayi");
			}
			else {break;}
		}
		System.out.println("ay gir:\n1.ocak\n2.subat\n3.mart\n4.nisan\n5.mayis\n6.haziran\n7.temmuz\n8.agustos\n9.eylul\n10.ekim\n11.kasim\n12.aralik");
		ay=ikbal.nextInt();
		switch(ay) {
		 case 12: t+=30;
         case 11: t+=31;
         case 10: t+=30;
         case 9: t+=31;
         case 8: t+=31;
         case 7: t+=30;
         case 6: t+=31;
         case 5: t+=30;
         case 4: t+=31;
         case 3: t+=28;
         case 2: t+=31;
         case 1: t+=g;
         default:System.out.println("Yanlis sayi");
		}
		System.out.println("yilin:"+t+"gunu");
	}
}
