package Pojazdy;

import java.util.Date;

public class DanePojazdow {
    private int nrSprawy;
    private String markaPojazdu;
    private String nrRejestracyjny;
    private String wlasciciel;
    private String ostatniOdbPisma;
    private Date dataOstPisma;

    public DanePojazdow(int s, String m, String n, String w, String o, Date d){
        nrSprawy = s;
        markaPojazdu = m;
        nrRejestracyjny = n;
        wlasciciel = w;
        ostatniOdbPisma = o;
        dataOstPisma = d;
    }

    public int getNrSprawy() {
        return nrSprawy;
    }

    public void setNrSprawy(int nrSprawy) {
        this.nrSprawy = nrSprawy;
    }

    public String getMarkaPojazdu() {
        return markaPojazdu;
    }

    public void setMarkaPojazdu(String markaPojazdu) {
        this.markaPojazdu = markaPojazdu;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public String getOstatniOdbPisma() {
        return ostatniOdbPisma;
    }

    public void setOstatniOdbPisma(String ostatniOdbPisma) {
        this.ostatniOdbPisma = ostatniOdbPisma;
    }

    public Date getDataOstPisma() {
        return dataOstPisma;
    }

    public void setDataOstPisma(Date dataOstPisma) {
        this.dataOstPisma = dataOstPisma;
    }

    @Override
    public String toString() {
        return "DanePojazdow{" +
                "nrSprawy=" + nrSprawy +
                ", markaPojazdu='" + markaPojazdu + '\'' +
                ", nrRejestracyjny='" + nrRejestracyjny + '\'' +
                ", wlasciciel='" + wlasciciel + '\'' +
                ", ostatniOdbPisma='" + ostatniOdbPisma + '\'' +
                ", dataOstPisma=" + dataOstPisma +
                '}';
    }
}
