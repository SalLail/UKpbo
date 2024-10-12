public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor
    public Mobil(String jenis, int tahun, int jumlahPintu) {
        super(jenis, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    // Getter dan Setter
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    // Method
    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    // Overloading
    public void info(String merek) {
        System.out.println("Merek Mobil: " + merek);
        info();
    }
}