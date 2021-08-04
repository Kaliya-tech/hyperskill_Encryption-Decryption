import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int colums = scanner.nextInt();

        int[][] arr = new int[rows][colums];

        int count = 0;
        int check = 0;
        int result = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                count = arr[i][j];
                if (count > Integer.MIN_VALUE) {
                    check = count;
                    System.out.println(check + " CH");
                } else if (count > check) {
                    result = count;
                    System.out.println(result + " RES");
                }
            }
        }
        System.out.println(Math.max(result, count));
    }
}