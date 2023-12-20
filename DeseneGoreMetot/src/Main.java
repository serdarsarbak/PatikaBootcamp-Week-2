import java.util.Scanner;

public class Main {
    //Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
    //Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi
    // sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.


    // metotta üç değişken var. birincisi kullanıcının girdiği değer, ikincisi kullanıcının girdiği değeri saklayan değer
    //üçüncüsü metot işlerken sayının 0 veya negatife düşüp düşmediğini takip eden boolean bir değer.
    static int metot (int num, int firstNum, boolean isNegative ) {

        //eğer sayı henüz negatif veya 0 olmamışsa 5 azaltma
        if (num>0 && !isNegative) {
            num -=5;
            System.out.print(num + " ");
        }

        //eğer sayı negatif veya 0 olmuşsa 5 artırma
        if (num>=0 && isNegative) {
            num +=5;
            System.out.print(num + " ");
        }
        //eğer sayı ilk defa 0 veya negatif olmuşsa isNegative boolean ı true'ya çekme ve 5 artırma
        if (num<=0 && !isNegative) {
            isNegative = true;
            num +=5;
            System.out.print(num + " ");
        }

        // eğer sayı orjinal değerine gelmişse programı durdurma
        if (num == firstNum) {
            return 0;
        }

        //recursive metodu: sayı orjinal değerine gelene kadar fonksiyonu çağırmaya devam eder.
        return metot (num, firstNum, isNegative);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int num = input.nextInt();

        // 0 veya düşük değer girerse metot çalışmaz.
        if (num<= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            //ilk değerin yazdırılması:
            System.out.print(num + " ");
            // metodun çağırılması:
            metot (num, num, false);
        }

    }
}
