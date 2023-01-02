import java.util.Scanner;

public class KasaProgrami {
    public static void main(String[] args) {
        float armut=2.14F,elma=3.67F,domates=1.11F,muz=0.95F,patlican=5.0F;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo:");
        armut=girdi.nextInt();
        System.out.print("Elma Kaç Kilo:");
        elma=girdi.nextInt();
        System.out.print("Domates Kaç Kilo:");
        domates=girdi.nextInt();
        System.out.print("Muz Kaç Kilo:");
        muz=girdi.nextInt();
        System.out.print("Patlıcan Kaç Kilo:");
        patlican=girdi.nextInt();
       double toplam=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5;
        System.out.println("Toplam Tutar: "+toplam+ "TL");

    }
}
