import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();

        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(kalimat.charAt(i));
        }

        input.close();
    }
}