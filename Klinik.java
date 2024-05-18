package uts;

/**
 *
 * @author ASUS
 */
public class Klinik {
    private Pasien[] pasienList;
    private int jumlahPasien;

    // Constructor
    public Klinik(int kapasitas) {
        pasienList = new Pasien[kapasitas];
        jumlahPasien = 0;
    }

    // Menambah pasien
    public void tambahPasien(Pasien pasien) {
        if (jumlahPasien < pasienList.length) {
            pasienList[jumlahPasien] = pasien;
            jumlahPasien++;
        } else {
            System.out.println("Kapasitas penuh, tidak bisa menambah pasien baru.");
        }
    }

    // Menampilkan data pasien
    public void tampilkanPasien() {
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println(pasienList[i]);
        }
    }

    // Mengubah data pasien
    public void ubahPasien(int id, Pasien pasien) {
        for (int i = 0; i < jumlahPasien; i++) {
            if (pasienList[i].getId() == id) {
                pasienList[i] = pasien;
                return;
            }
        }
        System.out.println("Pasien dengan ID " + id + " tidak ditemukan.");
    }

    // Menghapus pasien
    public void hapusPasien(int id) {
        for (int i = 0; i < jumlahPasien; i++) {
            if (pasienList[i].getId() == id) {
                for (int j = i; j < jumlahPasien - 1; j++) {
                    pasienList[j] = pasienList[j + 1];
                }
                pasienList[jumlahPasien - 1] = null;
                jumlahPasien--;
                return;
            }
        }
        System.out.println("Pasien dengan ID " + id + " tidak ditemukan.");
    }
}