package String;
import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char ans = '-';

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                ans = s.charAt(i);
                break;
            }
        }

        if (ans == '-') {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}