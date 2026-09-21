import java.util.Scanner;

public class Soal23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maksimum = input.nextInt();
        int a = 0;
        int b = 1;

        while (a <= maksimum) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        input.close();
    }
}