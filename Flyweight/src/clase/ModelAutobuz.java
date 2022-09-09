package clase;

public class ModelAutobuz {
    String model;
    int anFabicatie;
    int nrLocuri;

    public ModelAutobuz(String model, int anFabicatie, int nrLocuri) {
        this.model = model;
        this.anFabicatie = anFabicatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "ModelAutobuz{" +
                "model='" + model + '\'' +
                ", anFabicatie=" + anFabicatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
