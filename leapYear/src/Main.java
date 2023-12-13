import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yıl Giriniz:");
        year = inp.nextInt();

        // 4 rakamının katı ve 100'ün katı olmayanlar veya 400'e kalansız olarak bölünebilenler
        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
            System.out.println(year+" bir artık yıldır");
        } else {
            System.out.println(year+" bir artık yıl değildir !");
        }

    }
}