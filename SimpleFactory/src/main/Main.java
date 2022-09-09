package main;

import fabrica.Fabrica;
import simpleFactory.MijlocTransport;
import simpleFactory.TipTransport;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        MijlocTransport tramvai=fabrica.returneazaMijTrans(TipTransport.Tramvai, "OT09STR");
        MijlocTransport autobuz=fabrica.returneazaMijTrans(TipTransport.Autobuz, "OT33MON");
        MijlocTransport troleibuz=fabrica.returneazaMijTrans(TipTransport.Troleibuz, "B110GOG");

        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
        autobuz.afisareNrInmatriculare();
    }
}
