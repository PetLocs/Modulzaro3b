package hu.petloc.modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Ember {

    private boolean idegenNyelv;
    private String nev;
    private int kor;
    private List<String> nyelvek = new ArrayList<>();
    private Set beszéltNyelvek;

    public Ember() {
        this("Péter", 38);
    }

    public Ember(String nev, int kor) {
        this(false, nev, kor);
    }

    public Ember(boolean idNyelv, String nev, int kor) {
        fillNyelvek();
        setKor(kor);
        setIdegenNyelv(idNyelv);
        setNev(nev);
    }

    private void fillNyelvek(){
        nyelvek.add("angol");
        nyelvek.add("német");
        nyelvek.add("olasz");
        nyelvek.add("francia");
    }
    public void nyelvHozzaAd(int szam){
        if (isIdegenNyelv()){
            switch (szam){
                case 0:
                    beszéltNyelvek.add(nyelvek.get(0));
                    break;
                case 1:
                    beszéltNyelvek.add(nyelvek.get(1));
                    break;
                case 2:
                    beszéltNyelvek.add(nyelvek.get(2));
                    break;
                case 3:
                    beszéltNyelvek.add(nyelvek.get(3));
                    break;
                default:

                    break;
            }
        }
    }

    public boolean isIdegenNyelv() {
        return idegenNyelv;
    }

    public void setIdegenNyelv(boolean idegenNyelv) {
        this.idegenNyelv = idegenNyelv;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
}
