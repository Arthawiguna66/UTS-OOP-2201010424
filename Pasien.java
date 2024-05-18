package uts;

/**
 *
 * @author I Kadek Artha WIguna
 * Nim:2201010424
 */
public class Pasien {
    private int id;
    private String nama;
    private int umur;
    private String alamat;

    // Constructor
    public Pasien() {
    }

    // Overloaded Constructor
    public Pasien(int id, String nama, int umur, String alamat) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "\n ID: " + id + 
                "\n Nama: " + nama + 
                "\n Umur: " + umur + 
                "\n Alamat: " + alamat;
    }
}

class PasienVIP extends Pasien {
    private String fasilitas;

    // Constructor
    public PasienVIP() {
    }

    // Overloaded Constructor
    public PasienVIP(int id, String nama, int umur, String alamat, String fasilitas) {
        super(id, nama, umur, alamat);
        this.fasilitas = fasilitas;
    }

    // Getter dan Setter untuk fasilitas
    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return super.toString() + ", Fasilitas: " + fasilitas;
    }
}

