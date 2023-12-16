import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r,nrt,sum,nSum=1,rSum=1,nrtSum=1;

        Scanner inp = new Scanner(System.in);

        System.out.println("n değerini giriniz: ");
        n = inp.nextInt();
        System.out.println("r değerini giriniz: ");
        r = inp.nextInt();

        for (int i=1;i<=n;i++){         // n!
            nSum = nSum*i;
        }
        for (int i=1;i<=r;i++){         // r!
            rSum = rSum*i;
        }

        nrt = n-r;                      // n-r

        for (int i=1;i<=nrt;i++){       // (n-r)!
            nrtSum = nrtSum*i;
        }

        sum = nSum / (rSum*nrtSum);     // C(n,r) = n! / (r! * (n-r)!)

        System.out.println("Sonuç: "+sum);

    }
}