public class Soal19 {
    public static void main(String[] args) {
        int angka = 3;

        for (int i = 1; i <= 5; i++) {
            System.out.print(angka + " ");
            angka *= 3;
            System.out.print(angka + " ");
            angka -= 5;
        }
    }
}