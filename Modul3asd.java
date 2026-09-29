import java.util.Arrays;

public class Modul3asd {
    public static void main(String[] args) {

        int[] data = {30, 87, 90, 3, 1, 50, 23, 4, 25, 23, 40, 35, 47, 2, 33};

        Arrays.sort(data);

        /*for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        int jumlah = 0;
        for (int angka : data ){
            jumlah += angka;
        }
        double ratarata = (double) jumlah / data.length;
        System.out.println("Rata-rata : "+ratarata);

        int minimum = data[0];
        int maksimum = data[data.length - 1];

        System.out.println("Data Minimum : " + minimum + "  Data Maksimum : " + maksimum);*/
        
        

        System.out.print("Bilangan Ganjil : ");
        for (int angka : data) {
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();

        System.out.print("Bilangan Prima  : ");
        for (int angka : data) {
            if (isPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
        System.out.println("\n");

        // 2. Array 2 Dimensi (3 Baris x 5 Kolom)
        int[][] array2D = new int[3][5];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array2D[i][j] = data[index++];
            }
        }

        System.out.println("=== Array 2 Dimensi (3x5) ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Pastikan method ini berada DI DALAM kurung kurawal class Modul3asd
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
