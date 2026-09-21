import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        char huruf = input.next().charAt(0);
        int jumlah = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == huruf) {
                jumlah++;
            }
        }

        System.out.print(jumlah);

        input.close();
    }
}