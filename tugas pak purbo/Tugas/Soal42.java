import java.util.Scanner;

public class Soal42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int terbesar = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            int angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }
        }

        System.out.print(terbesar);

        input.close();
    }
}