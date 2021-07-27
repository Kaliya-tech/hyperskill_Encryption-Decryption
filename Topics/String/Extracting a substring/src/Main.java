import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();

        for (int i = start; i < end + 1; i++) {
            System.out.print(input.charAt(i));
        }
    }
}