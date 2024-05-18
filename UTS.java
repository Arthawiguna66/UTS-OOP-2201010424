package uts;

import java.util.Scanner;

/**
 *
 * @author I Kadek Artha WIguna
 * Nim:2201010424
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Klinik klinik = new Klinik(100);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tambah Pasien VIP");
            System.out.println("3. Tampilkan Data Pasien");
            System.out.println("4. Ubah Data Pasien");
            System.out.println("5. Hapus Data Pasien");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();
                    Pasien pasien = new Pasien(id, nama, umur, alamat);
                    klinik.tambahPasien(pasien);
                    break;
                case 2:
                    System.out.print("Masukkan ID: ");
                    int idVIP = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Nama: ");
                    String namaVIP = scanner.nextLine();
                    System.out.print("Masukkan Umur: ");
                    int umurVIP = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Alamat: ");
                    String alamatVIP = scanner.nextLine();
                    System.out.print("Masukkan Fasilitas: ");
                    String fasilitas = scanner.nextLine();
                    PasienVIP pasienVIP = new PasienVIP(idVIP, namaVIP, umurVIP, alamatVIP, fasilitas);
                    klinik.tambahPasien(pasienVIP);
                    break;
                case 3:
                    klinik.tampilkanPasien();
                    break;
                case 4:
                    System.out.print("Masukkan ID pasien yang akan diubah: ");
                    int idUbah = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Umur baru: ");
                    int umurBaru = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan Alamat baru: ");
                    String alamatBaru = scanner.nextLine();
                    System.out.print("Apakah pasien VIP? (yes/no): ");
                    String isVIP = scanner.nextLine();
                    Pasien pasienBaru;
                    if (isVIP.equalsIgnoreCase("yes")) {
                        System.out.print("Masukkan Fasilitas baru: ");
                        String fasilitasBaru = scanner.nextLine();
                        pasienBaru = new PasienVIP(idUbah, namaBaru, umurBaru, alamatBaru, fasilitasBaru);
                    } else {
                        pasienBaru = new Pasien(idUbah, namaBaru, umurBaru, alamatBaru);
                    }
                    klinik.ubahPasien(idUbah, pasienBaru);
                    break;
                case 5:
                    System.out.print("Masukkan ID pasien yang akan dihapus: ");
                    int idHapus = scanner.nextInt();
                    klinik.hapusPasien(idHapus);
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}