import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int iNum,dtInt;
        double dNum,itDouble;

        Scanner inp = new Scanner(System.in);

        System.out.println("Tam Sayı Giriniz:");
        iNum = inp.nextInt();
        System.out.println("Ondalıklı Sayı Giriniz:");
        dNum = inp.nextDouble();

        itDouble = iNum;
        dtInt = (int) dNum;

        System.out.println(iNum + " Tam Sayısı " + itDouble + " Ondalıklı Sayısına Dönüştürüldü");
        System.out.println(dNum + " Ondalıklı Sayısı " + dtInt + " Tam Sayısına Dönüştürüldü");


    }
}