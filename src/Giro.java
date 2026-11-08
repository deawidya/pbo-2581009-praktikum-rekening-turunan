public class Giro extends Rekening {

    // Atribut khusus rekening giro
    private int batasOverdraft;

    // Constructor
    public Giro(String nomor, String pemilik, int saldo,
                int batasOverdraft) {

        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    // Override method tarik()
    @Override
    public boolean tarik(int jumlah) {

        if (jumlah <= 0 || saldo - jumlah < -batasOverdraft) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    // Override method cetakInfo()
    @Override
    public void cetakInfo() {

        // Memanggil method cetakInfo() dari class Rekening
        super.cetakInfo();

        // Menampilkan informasi jenis rekening
        System.out.println(
                "       Giro, batas overdraft "
                        + formatRupiah(batasOverdraft)
        );
    }
}
