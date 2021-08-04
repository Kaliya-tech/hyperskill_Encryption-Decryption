import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();

        String[] input = inp.split(" ");
        String w = input[0];
        int num = Integer.parseInt(input[1]);

        String[] word = w.split("");

        StringBuilder result = new StringBuilder(w);

        if(num == 0 || num > word.length) {
            System.out.println(w);
        } else {
            for (int i = 0; i < num; i++) {
                result.append(word[i]);
            }
            result.delete(0, num);
            System.out.println(result);
        }
    }
}