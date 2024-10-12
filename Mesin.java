public class Mesin {
    private int kapasitas;

    // Constructor
    public Mesin(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Getter dan Setter
    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Method
    public void info() {
        System.out.println("Kapasitas Mesin: " + kapasitas + " CC");
    }
}