import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double height,weight,index;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan scanner kullanarak değerleri alıyoruz
        System.out.print("Boyunuzu (metre cinsinde) giriniz :");
        height = inp.nextDouble();

        System.out.print("Kilonuzu giriniz :");
        weight = inp.nextDouble();

        // Kilo (kg) / Boy(m) * Boy(m) Formülüne göre index hesaplıyoruz
        index = weight / (height*height);

        System.out.print("Kitle Indeksiniz :"+index);


    }

}
