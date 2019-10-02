import java.util.ArrayList;

public class NaiveBayes {
    private ArrayList<Penyakit> penyakitList;

    public NaiveBayes(ArrayList<Penyakit> penyakitList) {
        this.penyakitList = penyakitList;
    }

    public float klasfikasiUmur(String umur, String hipertensi) {
        int count = 0, total = 0;
        for (Penyakit penyakit : penyakitList) {
            if (penyakit.getUmur().equals(umur) && penyakit.getHipertensi().equals(hipertensi))
                count++;
            if (penyakit.getHipertensi().equals(hipertensi))
                total++;
        }
        return (((float)count)/((float)total));
    }

    public float klasifikasiKegemukan(String kegemukan, String hipertensi) {
        int count = 0, total = 0;
        for (Penyakit penyakit : penyakitList) {
            if (penyakit.getKegemukan().equals(kegemukan) && penyakit.getHipertensi().equals(hipertensi))
                count++;
            if (penyakit.getHipertensi().equals(hipertensi))
                total++;
        }
        return (((float)count)/((float)total));
    }

    public int klasifikasiHipertensi(String hipertensi) {
        int count = 0;
        for (Penyakit penyakit : penyakitList) {
            if (penyakit.getHipertensi().equals(hipertensi))
                count++;
        }
        return count;
    }

    public float perhitungan(float umur, float kegemukan, float hipertensi) {
        return ((umur *  kegemukan) * hipertensi);
    }

    public String hipotesa(float iya, float tidak) {
        String result = "";
        if (iya > tidak)
            result = "\n\nHIPOTESA :\n\tHipertensi = Iya\n\tKemungkinan = " + iya;
        else if (iya < tidak)
            result = "\n\nHIPOTESA :\n\tHipertensi = Tidak\n\tKemungkinan = " + tidak;
        else {
            if (iya != 0.0 && tidak == 0.0)
                result = "\n\nHIPOTESA :\n\tHipertensi = Iya dan Tidak\n\tKemungkinan Iya = " + iya;
            else if (tidak != 0.0 && iya == 0.0)
                result = "\n\nHIPOTESA :\n\tHipertensi = Iya dan Tidak\n\tKemungkinan Tidak = " + tidak;
            else if (iya != 0.0 && tidak != 0.0)
                result = "\n\nHIPOTESA :\n\tHipertensi = Iya dan Tidak\n\tKemungkinan Iya = " + iya;
            else if (iya == 0.0 && tidak == 0.0)
                result = "\n\nHIPOTESA :\n\tHipertensi = Iya dan Tidak\n\tTidak ada kemungkinan";
        }
        return result;
    }
}