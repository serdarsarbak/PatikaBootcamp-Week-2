import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean isErrorL=false;
        boolean isErrorS=false;

        Scanner input = new Scanner(System.in);

        int[] array = {15,12,788,1,-1,-778,2,0};

        System.out.print("Bir sayı giriniz: ");

        int n = input.nextInt();

        Arrays.sort(array);

        int smaller = array[0];
        int controlS=n-array[0];

        int larger = array[array.length-1];
        int controlL=array[array.length-1];
        System.out.println(controlL);

        for (int i: array) {

            if ((n-i)<controlS && i<n) {
                controlS=n-i;
                smaller=i;
            }
            if ((i-n)<controlL && i>n) {
                controlL=i-n;
                larger=i;
            }
        }

        if (n<=array[0]) {
            isErrorS=true;
        }

        if (n>=array[array.length-1]) {
            isErrorL=true;
        }

        if (isErrorS) {
            System.out.println("Girdiğiniz sayıdan daha küçük bir sayı dizide bulunmamaktadır.");
        } else {
            System.out.println(smaller);
        }

        if (isErrorL) {
            System.out.println("Girdiğiniz sayıdan daha büyük bir sayı dizide bulunmamaktadır.");
        } else {
            System.out.println(larger);

        }
    }
}
