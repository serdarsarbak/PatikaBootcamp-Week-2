import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin
        // elemanlarını kullanıcıdan alınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int dimension = input.nextInt();

        int[] arr = new int[dimension];

        //kullanıcan dizinin elemanları alma:
        for (int i=0; i<arr.length; i++) {
            System.out.print((i+1) + ". elemanı giriniz: ");
            int newNum = input.nextInt();
            arr[i] = newNum;
        }
        //diziyi sıralama:
        Arrays.sort(arr);
        //sonucu yazdırma:
        System.out.println("Dizinin sıralaması: " + Arrays.toString(arr));

    }
}
