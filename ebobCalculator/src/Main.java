import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,counter=1,ebob=1,ekok;

        Scanner inp = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        n2 = inp.nextInt();

        while (counter <= n1 && counter <= n2){             // counter en küçük sayıya ulaştığında döngü biter

            if (n1 % counter == 0 && n2 % counter == 0){    // İki sayının ortak böldüğü sayılara bakılır

                ebob = counter;                             // Var ise yeni ebob değeri bulunan sayı olur
            }

            counter++;                                      // while döngüsünü kontrol edebilmek için counter her sayıda güncellenir
        }

        ekok = (n1*n2)/ebob;

        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+ekok);


    }
}