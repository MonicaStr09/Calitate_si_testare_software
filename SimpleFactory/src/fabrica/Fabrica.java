package fabrica;

import simpleFactory.*;

public class Fabrica {
    public MijlocTransport returneazaMijTrans(TipTransport tip, String nrInmatriculare){
        switch (tip){
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
