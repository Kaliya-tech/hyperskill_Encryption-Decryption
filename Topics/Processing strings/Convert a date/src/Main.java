import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String[] parts = text.split("-");

        System.out.println( parts[1] + "/" + parts[2] + "/" + parts[0]);
    }
}