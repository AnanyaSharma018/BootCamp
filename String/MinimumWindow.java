package String;
import java.util.Scanner;

public class MinimumWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[256];

            for (int k = 0; k < t.length(); k++)
                freq[t.charAt(k)]++;

            int count = t.length();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (freq[ch] > 0)
                    count--;

                freq[ch]--;

                if (count == 0) {
                    String temp = s.substring(i, j + 1);

                    if (ans.equals("") || temp.length() < ans.length())
                        ans = temp;

                    break;
                }
            }
        }

        System.out.println("Minimum Window = " + ans);
    }
}