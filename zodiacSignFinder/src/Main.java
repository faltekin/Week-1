import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month,day;
        String zodiac = "";

        Scanner inp = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        month = inp.nextInt();
        System.out.println("Doğduğunuz gün : ");
        day = inp.nextInt();

        if ((day > 0 && day <= 31) && (month > 0 && month <= 12)) {

            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
                zodiac = "Koç";
            } else if ((month == 4 && day >= 21 && day <= 30) || (month == 5 && day <= 21)) {
                zodiac = "Boğa";
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                zodiac = "İkizler";
            } else if ((month == 6 && day >= 23 && day <= 30) || (month == 7 && day <= 22)) {
                zodiac = "Yengeç";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                zodiac = "Aslan";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                zodiac = "Başak";
            } else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day <= 22)) {
                zodiac = "Terazi";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                zodiac = "Akrep";
            } else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day <= 21)) {
                zodiac = "Yay";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                zodiac = "Oğlak";
            } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                zodiac = "Kova";
            } else if ((month == 2 && day >= 20 && day <= 29) || (month == 3 && day <= 20)) {
                zodiac = "Balık";
            }

            System.out.println("Burcunuz: " + zodiac);

        } else System.out.println("Hatalı Tarih");


    }
}