public class Kendaraan {
    private String jenis;
    private int tahun;

    // Constructor
    public Kendaraan(String jenis, int tahun) {
        this.jenis = jenis;
        this.tahun = tahun;
    }

    // Getter dan Setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Method
    public void info() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Tahun Kendaraan: " + tahun);
    }
}