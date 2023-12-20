import java.util.Scanner;
public class Main {
    static boolean isPalindrom (int number) {

        int tempNum, lastDigit, newNum = 0;
        tempNum = number;
        while (tempNum > 0) {

            lastDigit = tempNum % 10;
            newNum = newNum * 10 + lastDigit;

            tempNum = tempNum / 10;

        }

        return number == newNum;
    }


    public static void main(String[] args) {
        boolean isExit = false;
        Scanner input = new Scanner (System.in);

        while (!isExit ) {
            System.out.print("Lütfen sayı giriniz: ");
            int num = input.nextInt();

            if (isPalindrom(num)) {
                System.out.println(num + " sayısı palindrom sayıdır.");
                isExit = true;
            } else {
                System.out.println(num + " sayısı palindrom sayı değildir. ");
            }
        }




    }
}
