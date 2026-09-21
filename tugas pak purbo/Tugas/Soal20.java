public class Soal20 {
    public static void main(String[] args) {
        int angka = 1;
        int tambah = 1;

        for (int i = 1; i <= 13; i++) {
            System.out.print(angka + " ");
            angka += tambah;
            tambah++;

            if (tambah > 3) {
                tambah = 1;
            }
        }
    }
}