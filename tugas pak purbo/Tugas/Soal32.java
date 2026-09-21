import java.util.Scanner;

public class Soal32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal = input.nextInt();
        int akhir = input.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}