package String;
import java.util.Scanner;

public class ReplaceString
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String num = sc.nextLine();

        String[] parts = name.split(" ");

        String result = parts[0] + "_" + parts[parts.length - 1] + num;

        System.out.println(result);
    }
}