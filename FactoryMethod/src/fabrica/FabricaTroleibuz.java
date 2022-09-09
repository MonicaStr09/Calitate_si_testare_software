package fabrica;

import mijloc.Autobuz;
import mijloc.MijlocTransport;
import mijloc.Tramvai;
import mijloc.Troleibuz;

public class FabricaTroleibuz implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);

    }
}
