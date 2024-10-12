package hu.petloc;

import hu.petloc.modell.Ember;

public class Main {
    public static void main(String[] args) {
        Ember elso = new Ember();
        Ember masodik = new Ember("Géza", 24, true);
        Ember harmadik = new Ember("Tina", 28);
    }
}