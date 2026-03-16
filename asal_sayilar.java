package java_projelerim;
public class asal_sayilar {
    public static void main(String[] args) {
        int s=0,n=2,t=0;
        while (s<100) {
            int bs=0;
            for (int i=1;i<=n;i++) {
                if (n%i==0) {
                    bs++;
                }
            }
            if (bs==2){
                t=t+n;
                s++;
            }
            n++;
        }
        System.out.println("Toplam:"+t);
    }
}