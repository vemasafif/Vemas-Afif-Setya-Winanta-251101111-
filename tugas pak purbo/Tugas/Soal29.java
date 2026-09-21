import java.util.Scanner;

public class Soal29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal = input.nextInt();
        int akhir = input.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}