package practices;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen not girin");
        int not=scan.nextInt();

        if (not>=50){
            System.out.println("sınıfı gectin");
        }else if (not<=10){
            System.out.println("biraz calis");
        } else if (not>=11 && not<=49) {
            System.out.println("az daha gayret et");
        }
    }
}
