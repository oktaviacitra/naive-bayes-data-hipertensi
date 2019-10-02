public class Penyakit {
    private String umur;
    private String kegemukan;
    private String hipertensi;

    public Penyakit() {

    }

    public Penyakit(String umur, String kegemukan, String hipertensi) {
        this.umur = umur;
        this.kegemukan = kegemukan;
        this.hipertensi = hipertensi;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getUmur() {
        return umur;
    }

    public void setKegemukan(String kegemukan) {
        this.kegemukan = kegemukan;
    }

    public String getKegemukan() {
        return kegemukan;
    }

    public void setHipertensi(String hipertensi) {
        this.hipertensi = hipertensi;
    }

    public String getHipertensi() {
        return hipertensi;
    }
}