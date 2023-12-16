
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {        // Yüze kadar döngüye soktum
            int n = 0;                          // n değerini sıfırdan başlatıp döngünün içinde değerini arttırdım
            for (int m = 1; m <= i; m++) {
                if (i % m == 0) {               // Bu döngüyle i sayısının bölenlerini buldum
                    n++;                        // Kendisini bölen sayı buldukça sayaç bir artar
                }
            }

            if (n == 2) {                       // Döngü sonunda eğer bölen sayısı ikiye ulaşırsa o anki i değerini ekrana yazdırdım
                System.out.println(i);
            }
        }


    }
}