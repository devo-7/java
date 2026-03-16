package java_projelerim;
import java.util.Scanner;
public class oklid_ebob {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int a,b;
        System.out.print("1 sayi gir: ");
        a=oku.nextInt();
        System.out.print("2 sayi gir: ");
        b=oku.nextInt();
        while (b!=0) {
            int k=a%b;
            a=b;
            b=k;
        }
        System.out.println("ebob:"+a);
    }
}