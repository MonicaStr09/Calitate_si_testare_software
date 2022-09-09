package fabrica;

import mijloc.MijlocTransport;
import mijloc.Tramvai;

public class FabricaTramvai implements AbstractFactory{
    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
