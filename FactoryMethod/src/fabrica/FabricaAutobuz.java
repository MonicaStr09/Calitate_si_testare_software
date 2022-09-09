package fabrica;

import mijloc.Autobuz;
import mijloc.MijlocTransport;

public class FabricaAutobuz implements AbstractFactory{

    @Override
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
