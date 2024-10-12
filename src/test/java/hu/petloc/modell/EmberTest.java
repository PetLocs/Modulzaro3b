package hu.petloc.modell;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmberTest {

    @BeforeEach
    void setUp() {
        tesztEsetek();
    }

    @Test
    void tesztEsetek() {
        nullNev();
        //nullKor();
        //negativKor();
        //ismeretlenNyelv();
    }

    @Test
    void nullKor() {
        Ember kortalan = new Ember("Zoli");
        assert kortalan == null : "Nincs kor meghatározva!";
    }

    @Test
    void nullNev() {
        Ember nevtelen = new Ember(null);
        assert nevtelen.getNev() == null : "Nincs név meghatározva!";
    }
}