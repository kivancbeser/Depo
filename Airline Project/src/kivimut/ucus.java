package kivimut;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public abstract class ucus {
    private String kalkis;
    private String varis;
    private String saat;
    private int boskoltuk;

    public ucus(String kalkis, String varis, String saat, int boskoltuk) {
        this.kalkis = kalkis;
        this.varis = varis;
        this.saat = saat;
        this.boskoltuk = boskoltuk;
    }

    public String getKalkis() {
        return kalkis;
    }

    public void setKalkis(String kalkis) {
        this.kalkis = kalkis;
    }

    public String getVaris() {
        return varis;
    }

    public void setVaris(String varis) {
        this.varis = varis;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public int getBoskoltuk() {
        return boskoltuk;
    }

    public void setBoskoltuk(int boskoltuk) {
        this.boskoltuk = boskoltuk;
    }
    
    
}
