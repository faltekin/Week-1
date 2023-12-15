import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num,sum=0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        num = inp.nextInt();

        for (int i=1;i<num;i++){
            if (num % i == 0){  // Kendisini kalansız bölen sayıları buldum
                sum = sum + i;  // Döngü içinde bu sayıları topladım
            }
        }

        if (num == sum){        // Sayı ve toplamın eşit olup olmadığını kontrol ettim
            System.out.println(num+" Mükemmel Sayıdır");
        } else System.out.println(num+" Mükemmel Sayı Değildir");





    }
}