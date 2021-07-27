import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int state = 0;

        if (num >= -14 && num <= 12) {
            state = 1;
        } else if (num == 15 || num == 16) {
            state = 2;
        } else if (num >= 19) {
            state = 3;
        }

        switch (state) {
            case 1:
            case 2:
            case 3:
                System.out.println("True");
                break;
            default:
                System.out.println("False");
                break;
        }
    }
}