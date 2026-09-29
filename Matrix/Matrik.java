package Matrix;

public class Matrik {
    private int nBaris, nKolom;
    private double[][] itemDt;

    // Constructor 1: membuat matriks kosong nBaris x nKolom
    public Matrik(int nBrs, int nKlm) {
        nBaris = nBrs;
        nKolom = nKlm;
        itemDt = new double[nBaris][nKolom];
    }

    // Constructor 2: membuat matriks dari array 2 dimensi
    public Matrik(double[][] A) {
        this(A.length, A[0].length); // panggil constructor 1
        for (int i = 0; i < nBaris; i++) {
            for (int j = 0; j < nKolom; j++) {
                this.itemDt[i][j] = A[i][j];
            }
        }
    }

    public int getnBaris() {
        return nBaris;
    }

    public int getnKolom() {
        return nKolom;
    }

    public double getItem(int idB, int idK) {
        return this.itemDt[idB][idK];
    }

    public void setItem(int idB, int idK, double dt) {
        this.itemDt[idB][idK] = dt;
    }

    // Fungsi tambah antara dua matriks A dan B
    public static Matrik tambah(Matrik A, Matrik B) {
        if (A.getnBaris() != B.getnBaris() || A.getnKolom() != B.getnKolom()) {
            return null;
        }
        Matrik hasil = new Matrik(A.getnBaris(), A.getnKolom());
        for (int i = 0; i < A.getnBaris(); i++) {
            for (int j = 0; j < A.getnKolom(); j++) {
                hasil.setItem(i, j, A.getItem(i, j) + B.getItem(i, j));
            }
        }
        return hasil;
    }

    // Fungsi perkalian antara vektor (Larik) dengan matriks
    public static Larik VektorKaliMatrik(Larik L, Matrik M) {
        Larik lHasil = null;
        Larik lKolom = null;
        if (L.getSize() == M.getnBaris()) {
            lHasil = new Larik(M.getnKolom());
            for (int i = 0; i < M.getnKolom(); i++) {
                lKolom = M.getKolom(i);
                double hasil = Larik.LarikKaliLarik(L, lKolom);
                lHasil.isiItem(i, hasil);
            }
        }
        return lHasil;
    }

    // Fungsi transpos suatu matriks
    public static Matrik tranpos(Matrik A) {
        Matrik hasil = new Matrik(A.getnKolom(), A.getnBaris());
        for (int i = 0; i < A.getnBaris(); i++) {
            for (int j = 0; j < A.getnKolom(); j++) {
                hasil.setItem(j, i, A.getItem(i, j));
            }
        }
        return hasil;
    }

    // Fungsi untuk mendapatkan vektor baris dari matriks
    public Larik getBaris(int idBaris) {
        Larik l = new Larik(this.nKolom);
        for (int j = 0; j < this.nKolom; j++) {
            l.isiItem(j, this.getItem(idBaris, j));
        }
        return l;
    }

    // Fungsi untuk mendapatkan vektor kolom dari matriks
    public Larik getKolom(int idKolom) {
        Larik l = new Larik(this.nBaris);
        for (int i = 0; i < this.nBaris; i++) {
            double itemKolom = this.getItem(i, idKolom);
            l.isiItem(i, itemKolom);
        }
        return l;
    }

    // Procedure cetak matriks
    public void cetak(String kom) {
        System.out.println(kom);
        for (int i = 0; i < this.nBaris; i++) {
            for (int j = 0; j < this.nKolom; j++) {
                System.out.printf("%.2f ", this.itemDt[i][j]);
            }
            System.out.println();
        }
    }
} 
