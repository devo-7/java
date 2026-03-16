package java_projelerim;
import java.util.Scanner;

public class no_11 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int s1,s2,b=0,a=0,t=0;
        System.out.print("1 sayi gir: ");
        s1=oku.nextInt();
        System.out.print("2 sayi gir: ");
        s2=oku.nextInt();
        for(int i=s1;i<=s2;i++) {
            for (int j=1;j<=i;j++) {
                if (i%j==0) {
                    b++;
                }
            }
            if (b==2) {
                t+=i;
                a++;
            }
        }
        if (a!=0) {
            System.out.println("ortalama:"+(t/a));
        } 
        else {
            System.out.println("asal sayi yok");
        }
    }
}