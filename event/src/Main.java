import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);

        // Scanner kullanarak kullanıcıdan değerleri aldım

        System.out.println("Sıcaklık Giriniz:");
        heat = inp.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat<= 5 || heat<=15){
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (heat<= 15 || heat<=25){
            System.out.println("Pikniğe gidebilirsiniz");
        } else if (heat>25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }

}