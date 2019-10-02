import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<Penyakit> penyakitList = new ArrayList<Penyakit>(10);
            penyakitList.add(new Penyakit("Muda", "Gemuk", "Tidak"));
            penyakitList.add(new Penyakit("Muda", "Sangat Gemuk", "Tidak"));
            penyakitList.add(new Penyakit("Paruh Baya", "Gemuk", "Tidak"));
            penyakitList.add(new Penyakit("Paruh Baya", "Terlalu Gemuk", "Iya"));
            penyakitList.add(new Penyakit("Tua", "Terlalu Gemuk", "Iya"));
            NaiveBayes naiveBayes = new NaiveBayes(penyakitList);
            Controller controller = new Controller();
            controller.judul();
            String umur = controller.umur();
            String kegemukan = controller.kegemukan();
            float klasifikasiUmurIya = naiveBayes.klasfikasiUmur(umur, "Iya");
            float klasifikasiUmurTidak = naiveBayes.klasfikasiUmur(umur, "Tidak");
            float klasifikasiKegemukanIya = naiveBayes.klasifikasiKegemukan(kegemukan, "Iya");
            float klasifikasiKegemukanTidak = naiveBayes.klasifikasiKegemukan(kegemukan, "Tidak");
            float jumlahIya = (float) naiveBayes.klasifikasiHipertensi("Iya");
            float jumlahTidak = (float) naiveBayes.klasifikasiHipertensi("Tidak");
            float perhitunganIya = naiveBayes.perhitungan(klasifikasiUmurIya, klasifikasiKegemukanIya, jumlahIya);
            float perhitunganTidak = naiveBayes.perhitungan(klasifikasiUmurTidak, klasifikasiKegemukanTidak, jumlahTidak);
            System.out.println(naiveBayes.hipotesa(perhitunganIya, perhitunganTidak));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}