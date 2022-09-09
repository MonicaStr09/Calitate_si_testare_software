package main;

import fabrica.FabricaAutobuz;
import fabrica.FabricaTramvai;
import fabrica.FabricaTroleibuz;
import mijloc.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz=new FabricaAutobuz().returneazaMijlocTransport(" B 09 CTX");
        MijlocTransport tramvai=new FabricaTramvai().returneazaMijlocTransport(" CT 09 SSS");
        MijlocTransport troleibuz=new FabricaTroleibuz().returneazaMijlocTransport(" OT 20 ALX");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}
