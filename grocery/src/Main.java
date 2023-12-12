import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplam=0.0;

        Scanner inp = new Scanner(System.in);


        // Toplam değerini 0 başlatıp her seferinde yeni fiyatı üzerine ekleyerek devam ettim
        // Scanner kullanarak kullanıcıdan değerleri aldım

        System.out.print("Armut Kac Kilo ? : ");
        toplam = toplam + inp.nextDouble() * armut;

        System.out.print("Elma Kac Kilo ? : ");
        toplam = toplam + inp.nextDouble() * elma;

        System.out.print("Domates Kac Kilo ? : ");
        toplam = toplam + inp.nextDouble() * domates;

        System.out.print("Muz Kac Kilo ? : ");
        toplam = toplam + inp.nextDouble() * muz;

        System.out.print("Patlican KaÃ§ Kilo ? : ");
        toplam = toplam + inp.nextDouble() * patlican;

        System.out.print("Toplam Tutar : " +toplam);



    }
}
