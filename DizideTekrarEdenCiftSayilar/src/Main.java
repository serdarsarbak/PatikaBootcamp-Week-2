import java.util.Arrays;
public class Main {
    static boolean isCheck (int[] arr, int num){
        for(int i: arr) {
            if (i==num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,3,65,3,2,5,6,2,5,4,3,6,4,6};
        int[] duplicateArr=new int [array.length];
        int count =0;

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if (i != j && array[i] == array[j] && array[i]%2==0) {
                    if (!isCheck(duplicateArr, array[i])) {
                        duplicateArr[count] = array[i];
                        count++;
                        break;
                    }

                }
            }
        }

        for (int i: duplicateArr) {
            if (i!=0) {
                System.out.println(i);
            }
        }
    }
}
