import java.util.Scanner;

public class Main {

    //Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak
    // yapan program.
    static int exponential (int base, int power) {
        //üst 1'e indiğinde tabana eşitleme:
        if (power == 1) {
            return base;
        }
        //üst değeri 0 ise sayıyı 1'e eşitleme:
        if (power == 0) {
            return 1;
        }

        if (power <0) {
            System.out.println("Üst sayı negatif olduğunda hesaplamanın nasıl olacağını henüz çözemedim.");
            System.exit(0);
        }
        //recursive kurulumu:
        return exponential(base, (power-1))* base;

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int num1 = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int num2 = input.nextInt();

        //sonucun yazdırılması:
        System.out.println(num1 + "^" + num2 + " = " + exponential(num1, num2));
    }
}
