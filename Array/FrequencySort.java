package Array;
import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        Arrays.sort(arr);

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(map.get(arr[i]) < map.get(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int x : arr)
            System.out.print(x + " ");
    }
}