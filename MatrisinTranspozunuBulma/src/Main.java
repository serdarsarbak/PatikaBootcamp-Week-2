import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

        // kullanıcıdan matris alma işlemleri:
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz: ");
        int line = input.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int column = input.nextInt();
        int[][] matris = new int[line][column];
        for (int i=0; i<matris.length;i++){
            for (int j=0; j<matris[i].length;j++){
                System.out.print("Matrisin [" + i + "]" + " [" + j + "] elemanını giriniz: ");
                int newElement = input.nextInt();
                matris[i][j] = newElement;
            }
        }

        //matrisin transpozunu bulma:
        int[][] duplicate = new int [column][line];
        for (int i=0; i<matris.length; i++) {
            for (int j=0; j<matris[i].length; j++){
                duplicate[j][i] = matris[i][j];
            }
        }
        System.out.println("----------------");

        //orjinal matrisi ekrana bastırma:
        System.out.println("Matris:");
        for (int[] i: matris) {
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //transpozunu ekrana bastırma:
        System.out.println("----------------");
        System.out.println("Matrisin transpozu:");
        for (int[] i: duplicate) {
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
