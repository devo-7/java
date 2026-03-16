package java_projelerim;
import java.util.Scanner;
public class no_4 {
	public static void main(String[] args) {
		//bu program sadece 4 basamağa kadar sayıları çevirir
		Scanner oku=new Scanner(System.in);
		int s,b,on,yuz,t,bin,x,y,z;
		System.out.println("Herhangi bir sayi giriniz:");
		s=oku.nextInt();
		while(s<0) {
			System.out.println("Pozitif sayi girmeniz lazim");
			break;
		}
		while(s>0) {
			b=s%10;
			bin=s/1000;
			yuz=(s/100)%10;
			on=(s%100)/10;
			t=bin+yuz+on+b;
			x=(t%100)/10;
			y=t%10;
			z=x+y;
			System.out.println(bin+"+"+yuz+"+"+on+"+"+b+"="+t);
			System.out.println(x+"+"+y+"="+z);
			break;
		}
	}
}
