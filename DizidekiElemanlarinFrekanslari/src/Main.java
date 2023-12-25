public class Main {
    //sayı tekrarının daha önce yapılıp yapılmadığının kontrolü.
    static boolean isCheck(int[] arr, int value){
        for (int i: arr) {
            if (i==value) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate=new int[arr.length];
        int duplicateIndex = 0;

        System.out.println("Tekrar sayıları:");

        for (int i=0; i<arr.length; i++) {
            if(isCheck(duplicate, arr[i])) {
                duplicate[duplicateIndex++] = arr[i];
                int count = 0;
                for (int j: arr){
                    if (j==arr[i]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
