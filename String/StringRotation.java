package String;
import java.util.*;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int k = sc.nextInt();

        int n = str.length();
        k = k % n;

        String left = "";
        String right = "";

     
        for (int i = k; i < n; i++)
            left += str.charAt(i);
        for (int i = 0; i < k; i++)
            left += str.charAt(i);

      
        for (int i = n - k; i < n; i++)
            right += str.charAt(i);
        for (int i = 0; i < n - k; i++)
            right += str.charAt(i);

        System.out.println("Left Rotation: " + left);
        System.out.println("Right Rotation: " + right);
    }
}