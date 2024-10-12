public class Truk extends Kendaraan {
    private int kapasitasMuatan;

    // Constructor
    public Truk(String jenis, int tahun, int kapasitasMuatan) {
        super(jenis, tahun);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    // Getter dan Setter
    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    // Method
    @Override
    public void info() {
        super.info();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " ton");
    }
}