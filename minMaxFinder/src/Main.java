import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int loop,num,numMax=0,numMin=0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        loop = inp.nextInt();

        for (int i=1;i<=loop;i++) {

            System.out.println(i+". Sayıyı giriniz:");
            num = inp.nextInt();
            if (i == 1)
            {
                // Döngünün başında girdiğim ilk sayının değerini min ve max olarak belirledim
                numMax = num;
                numMin = num;
            }
                // Girdiğim ikinci sayıda oluşturduğum iki sorguya göre min veya max kontrolü yaptım
            if (num > numMax)
            {
                numMax = num;
            }
            if (num < numMin)
            {
                numMin = num;
            }

        }
            System.out.println("En büyük sayı:"+numMax);
            System.out.println("En küçük sayı:"+numMin);

        }
    }
