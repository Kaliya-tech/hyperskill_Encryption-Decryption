import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int seats = scan.nextInt();
        String rows = "";

        System.out.println(row + " R");

        for (int i = 1; i < row; i++) {
            rows = scan.nextLine();
            System.out.println(rows);
        }
     //   System.out.println(rows);

    }
}