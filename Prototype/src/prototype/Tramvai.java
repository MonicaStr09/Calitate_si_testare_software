package prototype;

public class Tramvai implements Prototype{
    private String soferTramvai;

    @Override
    public Prototype copiaza() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public Tramvai(String soferTramvai) {
        this.soferTramvai = soferTramvai;
    }

    public String getSoferTramvai() {
        return soferTramvai;
    }

    public void setSoferTramvai(String soferTramvai) {
        this.soferTramvai = soferTramvai;
    }
}
