import java.util.Scanner;

public class Soal48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal = input.nextInt();
        int akhir = input.nextInt();
        int total = 0;

        for (int i = awal; i <= akhir; i++) {
            if (i > 0 && i % 2 != 0) {
                total += i;
            }
        }

        System.out.print(total);

        input.close();
    }
}