package String;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int maxLen = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256];
            int len = 0;

            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (visited[ch])
                    break;

                visited[ch] = true;
                len++;
            }

            maxLen = Math.max(maxLen, len);
        }

        System.out.println("Length = " + maxLen);
    }
}