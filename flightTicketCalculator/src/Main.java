import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km,age,pasType;
        double fee,perKm=0.10,sum=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz :");
        km = inp.nextInt();

        System.out.println("Yaşınızı giriniz :");
        age = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        pasType = inp.nextInt();

        // mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2 olduğunun kontrolünü yaptım
        if ((km>0 && age>0) && (pasType == 1 || pasType == 2) ){

            fee = km * perKm;           // İlk olarak uçuşun toplam fiyatını hesapladım

            if (age < 12) {
                sum = fee * 0.5;        // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır
            } else if (age <= 24) {
                sum = fee * 0.1;        // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır
            } else if (age > 65) {
                sum = fee * 0.3;        // Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır
            }

            fee = fee - sum;            // Toplam fiyattan indirimi düştüm

            if ( pasType == 2){         // Gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
                sum = fee * 0.2;
                fee = ( fee - sum ) * 2;
            }

            System.out.println("Bilet fiyatı: " + fee);

        } else System.out.println("Hatalı Veri Girdiniz !");

    }
}