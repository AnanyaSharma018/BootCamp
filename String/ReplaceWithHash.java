package String;
import java.util.Scanner;
public class ReplaceWithHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String pattern = sc.nextLine();

        String result = str.replace(pattern, "#");

        System.out.println(result);
    }

}
