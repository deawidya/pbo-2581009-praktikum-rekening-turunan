public class Rekening {

    // Atribut rekening
    private String nomor;
    private String pemilik;
    protected int saldo;

    // Constructor
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // Method untuk setor uang
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }

        saldo += jumlah;
        return true;
    }

    // Method untuk tarik uang
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    // Method untuk menampilkan informasi rekening
    public void cetakInfo() {
        System.out.printf(
                "%s | %-6s | %12s%n",
                nomor,
                pemilik,
                formatRupiah(saldo)
        );
    }

    // Method untuk format mata uang Rupiah
    protected static String formatRupiah(int angka) {
        return "Rp" + String.format(
                java.util.Locale.US, "%,d", angka
        ).replace(',', '.');
    }
}
