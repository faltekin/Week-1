import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1,num2,total=1;

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        num1 = inp.nextInt();
        System.out.println("Üs olacak sayı: ");
        num2 = inp.nextInt();

        for (int i=1;i<=num2;i++){
            total = total * num1;
        }

        System.out.println("Sonuç: " + total);

    }
}