package prototype;

public class Autobuz implements Prototype {
    private String soferAutobuz;

    @Override
    public Prototype copiaza() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public Autobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    public String getSoferAutobuz() {
        return soferAutobuz;
    }

    public void setSoferAutobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }
}
