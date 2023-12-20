import java.util.Scanner;

public class Main {
    //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program.
    static boolean isPrimeNum (int num, int div) {
        // negatif değer girilirse hata verme.
        if (num<0) {
            System.out.println("Pozitif bir sayı giriniz.");
            System.exit(0);
        }

        // girilen değer 1 veya 0 ise asal sayı değildir.
        if (num ==1 || num==0) {
            return false;
        }

        //div eğer num sayısına kadar ulaşırsa num asal sayıdır.
        if (num == div) {
            return true;
        }
        // num div'e eşit bölünürse asal sayı değildir.
        if (num % div==0) {
            return false;
        }
        // recursive oluşumu; div 2 den başlayarak num sayısına kadar artar.
        return isPrimeNum(num, div+1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isExit = false;

        //asal sayı girene kadar sayı sormaya devam eder.
        while (isExit == false) {

            System.out.print("Lütfen bir sayı giriniz: ");
            int num = input.nextInt();

            // fonksiyona ikinci bir değişken olarak 2 verilir ve 2'den num sayısına kadar bu değişken artırılır.
            if (isPrimeNum(num, 2)) {
                System.out.println(num + " bir asal sayıdır.");
                isExit = true;
            } else {
                System.out.println(num + " bir asal sayı değildir.");
            }

        }
    }

}
