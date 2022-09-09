package testare.dubluri;

import clase2.IPachet;

public class PachetFake implements IPachet {

    Double pret;
    boolean rezerva;

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setRezerva(boolean rezerva) {
        this.rezerva = rezerva;
    }

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici() {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
