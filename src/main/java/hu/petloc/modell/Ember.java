package hu.petloc.modell;

import java.util.*;

public class Ember {

    private boolean idegenNyelv;
    private String nev;
    private int kor;
    private final List<String> NYELVEK = new ArrayList<>();
    private Set beszéltNyelvek;

    public Ember() {
        this("Péter", 38);
    }

    public Ember(String nev) {
        this(nev, 38, false);
    }

    public Ember(String nev, int kor) {
        this(nev, kor, false);
    }

    public Ember(String nev, int kor, boolean idNyelv ) {
        this.nev = nev;
        this.kor = kor;
        fillNyelvek();
        this.idegenNyelv = idNyelv;
        nyelvHozzaAd(setNyelvSzam());
    }

    public int setNyelvSzam() {
        return (int)(Math.random()*4);
    }

    private void fillNyelvek(){
        NYELVEK.add("angol");
        NYELVEK.add("német");
        NYELVEK.add("olasz");
        NYELVEK.add("francia");
    }
    public void nyelvHozzaAd(int szam){
        if (isIdegenNyelv()){
            beszéltNyelvek = new HashSet();
            switch (szam){
                case 0:
                    beszéltNyelvek.add(NYELVEK.get(0));
                    break;
                case 1:
                    beszéltNyelvek.add(NYELVEK.get(0));
                    beszéltNyelvek.add(NYELVEK.get(1));
                    break;
                case 2:
                    beszéltNyelvek.add(NYELVEK.get(0));
                    beszéltNyelvek.add(NYELVEK.get(1));
                    beszéltNyelvek.add(NYELVEK.get(2));
                    break;
                case 3:
                    beszéltNyelvek.add(NYELVEK.get(0));
                    beszéltNyelvek.add(NYELVEK.get(1));
                    beszéltNyelvek.add(NYELVEK.get(2));
                    beszéltNyelvek.add(NYELVEK.get(3));
                    break;
            }
        }
    }

    public boolean isIdegenNyelv() {
        return this.idegenNyelv;
    }

    public String getNev() {
        return this.nev;
    }

    public int getKor() {
        return this.kor;
    }

    public void valaszol(){
        String nyelv = idegenNyelv ? "Beszélek idegen nyelvet/nyelveket: " + this.beszéltNyelvek: "Nem beszélek idegen nyelveket.";
        System.out.printf("%s vagyok, %d éves, %s%n", getNev(), getKor(), nyelv);
    }
}
