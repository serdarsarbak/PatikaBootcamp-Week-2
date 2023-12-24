import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet sayı girilecek: ");
        int n = input.nextInt();
        double sum=0.0;
        double result;

        for (int i =1; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            int newNum = input.nextInt();
            sum += ((double) 1 /newNum);
        }

        result = n/sum;
        System.out.println("Girdiğiniz sayıların harmonik ortalaması: " + result);

    }
}
