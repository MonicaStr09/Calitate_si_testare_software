package fabrica;

import mijloc.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport returneazaMijlocTransport(String nrInmatriculare);
}
