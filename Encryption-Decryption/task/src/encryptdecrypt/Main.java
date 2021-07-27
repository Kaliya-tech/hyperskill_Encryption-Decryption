package encryptdecrypt;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inp = input.split("");
        System.out.println(Arrays.toString(inp));

        int key = scanner.nextInt();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int addChar = 0;
        String result = "";

        int i = 0;

        inp[i] = abc.substring(i + key);
        result += inp[i];
    }

}
// inp[i] = String.valueOf(abc.charAt(i + key));
// result += inp[i];
// b.append(result);
// System.out.print(b.toString());