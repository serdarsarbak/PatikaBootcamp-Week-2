public class Main {
    public static void main(String[] args) {
        // boks maçına başlayan dövüşçünün rasgele belirlenmesi yapılmıştır.

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 64);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 45);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
