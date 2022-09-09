package clase;

public class Autobuz {
    private State stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare=new LaCapatLinie();
    }

    public State getStare() {
        return stare;
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        InCursa inCursa=new InCursa();
        inCursa.schimbaStare(this);
    }

    public void intraInService(){
        LaReparat laReparat=new LaReparat();
        laReparat.schimbaStare(this);
    }

    public void ieseDinService(){
        LaCapatLinie laCapatLinie=new LaCapatLinie();
        laCapatLinie.schimbaStare(this);
    }

    public void ajungeLaCapatDeLinie(){
        LaCapatLinie laCapatLinie=new LaCapatLinie();
        laCapatLinie.schimbaStare(this);
    }
}
