public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales (String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        setPenjualan(penjualan);
        setKomisi(komisi);
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji() {
        return penjualan * komisi;
    }

    public String toString() {
        return String.format("Sales\t\t: %s\nPenjualan\t: %d\nKomisi\t\t: Rp%,.0f\nPendapatan\t: Rp%,.0f\n",
                super.toString(), getPenjualan(), getKomisi(), gaji());
    }

}
