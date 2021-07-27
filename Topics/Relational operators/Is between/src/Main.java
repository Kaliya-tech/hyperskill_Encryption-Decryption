import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int result = 0;

        if (num <= second && num >= third) {
            result = 1;
        } else if (num <= third && num >= second) {
            result = 2;
        }

        switch (result) {
            case 1:
            case 2:
                System.out.println(true);
                break;
            default:
                System.out.println(false);
                break;
        }
    }
}