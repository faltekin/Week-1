import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.Sayı :");
        a = inp.nextInt();

        System.out.println("2.Sayı :");
        b = inp.nextInt();

        System.out.println("3.Sayı :");
        c = inp.nextInt();

        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a < b < c");
            } else if (c<b){
                System.out.println("a < c < b");
            }
        } else if((b<a) && (b<c)){
            if(c<a){
                System.out.println("b < c < a");
            } else if ((a<c)){
                System.out.println("b < a < c");
            }
        } else if ((c < b) && (c < a)){
            if (b<a){
                System.out.println("c < b < a");

            } else if (a < b){
                System.out.println("c < a < b");
            }
        }



    }
}