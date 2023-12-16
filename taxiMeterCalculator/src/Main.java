import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int km;
        double amount,sum;

        Scanner inp = new Scanner(System.in);
        System.out.println("Gidilen km giriniz :");
        km = inp.nextInt();

        sum = (km * 2.20)+10;

        if (sum<=20){
            amount = 20;
        }else amount = sum;

        System.out.println(amount);
    }

}
