package yeni;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdvsiz;
        System.out.print("Lütfen Fiyat Giriniz :");
        kdvsiz=inp.nextDouble();

        //Eğer girilen tutar 0-1000 arasında ise KDV oranı %18, tutar 1000 TL'den büyük ise KDV oranı %8
        double kdvOrani = (kdvsiz>0 && kdvsiz<=1000) ? 0.18 : 0.08;
        double kdvTutari = (kdvsiz*kdvOrani);
        double kdvli= (kdvsiz+kdvTutari);
        System.out.println("KDV'siz tutar :"+kdvsiz+ "TL");
        System.out.println("KDV'li tutar :"+kdvli+"TL");
        System.out.println("KDV tutarı :"+kdvTutari+"TL");
        System.out.println("KDV oranı :"+"%" + (kdvOrani*100));







    }
}
