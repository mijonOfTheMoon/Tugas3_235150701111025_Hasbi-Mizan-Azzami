public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double gaji() {
        if (getTotalJam() <= 40) {
            return upahPerJam * totalJam;
        } else {
            return upahPerJam * 40 + upahPerJam * 1.5 * (totalJam - 40);
        }
    }

    public String toString() {
        return String.format("Pegawai Harian\t: %s\nUpah/Jam\t: Rp%,.0f\nTotal Jam Kerja\t: %d\nPendapatan\t: Rp%,.0f\n",
                super.toString(), getUpahPerJam(), getTotalJam(), gaji());
    }

}
