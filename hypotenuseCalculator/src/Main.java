import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1,num2,num3;
        double area,perimeter,u;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sırasıyla üçgenin üç kenarının değerini giriniz :");
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        num3 = inp.nextInt();

        perimeter = num1 + num2 + num3 ;
        u = perimeter / 2 ;
        area = Math.sqrt(u * (u - num1) * (u - num2) * (u - num3));
        System.out.print("Alan: " + area );

    }


}
