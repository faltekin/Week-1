import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

            int a,b,c,d;

            Scanner inp = new Scanner(System.in);

            System.out.print("1.Sayıyı Giriniz:");
            a = inp.nextInt();
            System.out.print("2.Sayıyı Giriniz:");
            b = inp.nextInt();
            System.out.print("3.Sayıyı Giriniz:");
            c = inp.nextInt();

            d = a+b*c-b;
            System.out.println(d);

    }
}