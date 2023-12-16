import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num,num1=0,num2=1,num3;

        Scanner inp = new Scanner(System.in);
        System.out.println("Eleman Sayısını Giriniz: ");
        num = inp.nextInt();

        for (int i=1;i<num;i++){

            System.out.print(num1+"+"+num2);
            num3 = num1 + num2;
            System.out.println("="+num3);

            // Döngü devam ettikçe num1 ve num2 değerleri değişir
            num1 = num2;
            num2 = num3;

        }



    }
}