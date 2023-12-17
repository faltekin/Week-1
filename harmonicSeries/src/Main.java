
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        double result=0.0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        num = inp.nextInt();

        for (int i=1;i<=num;i++){

            result += (1.0/i);
        }

        System.out.println("Sonuç : "+result);

    }
}