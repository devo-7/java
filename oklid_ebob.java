package java_projelerim;
import java.util.Scanner;
public class oklid_ebob {
	 
	 public static int ebob(int a,int b){
	        while (b!=0) {
	            int t=b;
	            b=a%b;  
	            a=t;
	        }
	        return a;
	    }
	 public static void main(String[] args){
		 	int s1,s2,n;
	        Scanner oku = new Scanner(System.in);
	        System.out.print("1 sayiyi gir:");
	        s1= oku.nextInt();
	        System.out.print("2 sayiyi gir:");
	        s2= oku.nextInt();
	        n= ebob(s1,s2);
	        System.out.println("sonuc:"+n);
	    }
	}
