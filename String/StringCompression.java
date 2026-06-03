package String;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 1;

        for(int i = 0; i < str.length(); i++) {
            count = 1;

            while(i < str.length() - 1 &&
                  str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            System.out.print(str.charAt(i));
            if(count > 1)
                System.out.print(count);
        }
    }
}