package clase;

public class Linie implements Flyweight{
    int nrLinie;
    String primaStatie;
    String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "nrLinie=" + nrLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void afiseazaDescriere(ModelAutobuz autobuz) {
        System.out.println(autobuz.toString()+ toString());
    }
}
