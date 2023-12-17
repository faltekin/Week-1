import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int num,tempNum,lenNum = 0,lenValue,result = 0,sum=0;

        System.out.println("Sayı Giriniz: ");
        num = inp.nextInt();

        tempNum = num;

        while (tempNum != 0){       // Basamak sayısı hesaplanır

            lenNum++;
            tempNum /= 10;

        }

        tempNum = num;              // Scanner ile aldığımız ilk değeri geri alır
        while (tempNum !=0){

            lenValue = tempNum % 10;
            int lenPow = 1;

            for (int i=1;1<=lenNum;i++){
                lenPow *= lenValue;
            }

            result += lenPow;
            tempNum /= 10;
            sum += lenValue;

        }

        if (result == num) {
            System.out.println(num + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(num + " sayısı bir Armstrong sayısı değildir.");
        }

        System.out.println(sum);
    }
}