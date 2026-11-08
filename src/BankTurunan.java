public class BankTurunan {
    public static void main(String[] args) {

        // Membuat objek rekening Tabungan
        Tabungan tabungan = new Tabungan(
                "101", "Ani", 1000000, 2.5
        );

        // Membuat objek rekening Giro
        Giro giro = new Giro(
                "201", "Budi", 200000, 500000
        );

        // Menampilkan informasi rekening awal
        System.out.println("========== REKENING AWAL ==========");

        tabungan.cetakInfo();
        giro.cetakInfo();

        // Menjalankan transaksi
        System.out.println("\n============ TRANSAKSI ============");

        // Transaksi 1: Tabungan tarik Rp1.500.000
        System.out.printf(
                "%-27s: %s%n",
                "Tabungan tarik 1.500.000",
                tabungan.tarik(1500000) ? "Berhasil" : "Ditolak"
        );

        // Transaksi 2: Giro tarik Rp500.000
        System.out.printf(
                "%-27s: %s%n",
                "Giro tarik 500.000",
                giro.tarik(500000) ? "Berhasil" : "Ditolak"
        );

        // Transaksi 3: Giro tarik Rp300.000
        System.out.printf(
                "%-27s: %s%n",
                "Giro tarik 300.000",
                giro.tarik(300000) ? "Berhasil" : "Ditolak"
        );

        // Transaksi 4: Giro setor Rp100.000
        System.out.printf(
                "%-27s: %s%n",
                "Giro setor 100.000",
                giro.setor(100000) ? "Berhasil" : "Ditolak"
        );

        // Transaksi 5: Menambahkan bunga tabungan
        int bunga = tabungan.tambahBunga();

        System.out.printf(
                "%-27s: %s%n",
                "Bunga tabungan",
                Rekening.formatRupiah(bunga)
        );

        // Menampilkan informasi rekening akhir
        System.out.println("\n========== REKENING AKHIR =========");

        tabungan.cetakInfo();
        giro.cetakInfo();
    }
}
