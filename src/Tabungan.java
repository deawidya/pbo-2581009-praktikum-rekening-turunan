public class Tabungan extends Rekening {

    // Atribut khusus rekening tabungan
    private double bungaPersen;

    // Constructor
    public Tabungan(String nomor, String pemilik, int saldo,
                    double bungaPersen) {

        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    // Method untuk menambahkan bunga tabungan
    public int tambahBunga() {

        int bunga = (int) (saldo * bungaPersen / 100);

        // Menambahkan bunga menggunakan method setor()
        setor(bunga);

        return bunga;
    }

    // Override method cetakInfo()
    @Override
    public void cetakInfo() {

        // Memanggil method cetakInfo() dari class Rekening
        super.cetakInfo();

        // Menampilkan informasi jenis rekening
        System.out.printf(
                "       Tabungan, bunga %.1f%% per bulan%n",
                bungaPersen
        );
    }
}
