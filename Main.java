public class Main {
    public static void main(String[] args) {
        // Instansiasi objek
        Mobil mobil = new Mobil("Sedan", 2020, 4);
        Motor motor = new Motor("Sport", 2019, 250);
        Truk truk = new Truk("Truk Besar", 2018, 10);

        // Panggil method
        mobil.info("Toyota");
        motor.info();
        truk.info();

    }
}