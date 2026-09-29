package Matrix;

public class Larik {
    private int size;
    private double[] itemLarik;

    public Larik(int n) {
        this.size = n;
        this.itemLarik = new double[n];
    }

    public int getSize() {
        return this.size;
    }

    public void isiItem(int id, double dt) {
        this.itemLarik[id] = dt;
    }

    public double getItem(int id) {
        return this.itemLarik[id];
    }

    // Fungsi perkalian dot produk antara dua larik
    public static double LarikKaliLarik(Larik L1, Larik L2) {
        double hasil = 0;
        for (int i = 0; i < L1.getSize(); i++) {
            hasil += L1.getItem(i) * L2.getItem(i);
        }
        return hasil;
    }

    // Procedure cetak larik
    public void cetak(String kom) {
        System.out.println(kom);
        for (int i = 0; i < this.size; i++) {
            System.out.printf("%.2f ", this.itemLarik[i]);
        }
        System.out.println();
    }
} 
    

