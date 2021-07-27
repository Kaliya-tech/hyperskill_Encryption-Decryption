import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int quantity = scanner.nextInt();

        String b = scanner.nextLine();
        String c = scanner.nextLine();
        String[] bridges = c.split(" ");

        int check = 0;
        int count = 0;


        for (int i = 0; i < bridges.length; i++) {
            check = Integer.parseInt(bridges[i]);
            if (check <= height) {
                System.out.println("Will crash on bridge " + (i + 1));
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Will not crash");
        }
    }
}