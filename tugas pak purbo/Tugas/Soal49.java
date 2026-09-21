import java.util.Scanner;

public class Soal49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal = input.nextInt();
        int akhir = input.nextInt();

        for (int i = awal; i <= akhir; i++) {
            boolean prima = i >= 2;

            for (int j = 2; j * j <= i && prima; j++) {
                if (i % j == 0) {
                    prima = false;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}