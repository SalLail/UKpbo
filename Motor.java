public class Motor extends Kendaraan {
    private int kecepatanMaksimal;

    // Constructor
    public Motor(String jenis, int tahun, int kecepatanMaksimal) {
        super(jenis, tahun);
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Getter dan Setter
    public int getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }

    public void setKecepatanMaksimal(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Method
    @Override
    public void info() {
        super.info();
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/jam");
    }
}