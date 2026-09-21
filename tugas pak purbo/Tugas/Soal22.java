import java.util.Scanner;

public class Soal22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long hasil = 1;

        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }

        System.out.print(hasil);

        input.close();
    }
}