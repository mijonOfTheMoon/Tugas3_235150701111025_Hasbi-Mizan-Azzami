public class Main {

    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Anisa Bahuwirya", "2713162487247381", 2490000);
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Haryanto Subiantoro", "4875900016223390", 200000, 29);
        Sales sales = new Sales("Gantar Ardiansyah", "3773301176886054", 32, 50000);

        System.out.println(pegawaiTetap.toString().replace(',', '.'));
        System.out.println(pegawaiHarian.toString().replace(',', '.'));
        System.out.println(sales.toString().replace(',', '.'));
    }

}
