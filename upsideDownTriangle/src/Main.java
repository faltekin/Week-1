import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üçgenin Yüksekliğini Giriniz:");
        num = inp.nextInt();

        for (int i = num; i > 0; i--) {

            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}