package encryptdecrypt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        String input = scanner.nextLine();
        int key = scanner.nextInt();


        if (operation.equals("enc")) {
            enc(input, key);
        } else {
            dec(input, key);
        }
    }

    public static void enc(String input, int key) {

        int addChar;

        for (int i = 0; i < input.length(); i++) {
            addChar = input.charAt(i);
            if (addChar <= 122 && addChar >= 97) {
                if (addChar + key > 122) {
                    addChar = addChar + key - 26;
                } else {
                    addChar = addChar + key;
                }
            }
            System.out.print((char)addChar);
        }
    }

    public static void dec(String input, int key) {

    }

}