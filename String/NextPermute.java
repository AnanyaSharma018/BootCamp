package String;
import java.util.*;

public class NextPermute {

    static boolean nextPermutation(char[] arr) {
        int i = arr.length - 2;

        
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false;
        }

      
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

      
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    
        int left = i + 1, right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();

        if (nextPermutation(arr)) {
            System.out.println(new String(arr));
        } else {
            System.out.println("No Next Permutation");
        }
    }
}