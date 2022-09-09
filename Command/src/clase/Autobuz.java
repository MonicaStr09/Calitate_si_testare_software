package clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void pleacaInCursa(int linie){
        System.out.println("Autobuzul cu nr de inmatriculare "+nrInmatriculare+" a plecat in cursa pe linia "+linie);
    }
}
