package practices;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 1 sayi girin");
        int sayi=scan.nextInt();

        if (sayi%5==0){
            System.out.println("sayi 5 in tam kati");
        }
        if (sayi%3==0){
            System.out.println("sayi 3 in tam kati");
        }

    }

}
