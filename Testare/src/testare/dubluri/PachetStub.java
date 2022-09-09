package testare.dubluri;

import clase2.IPachet;

public class PachetStub implements IPachet {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici() {

    }

    @Override
    public Double getPret() {
        return 1000.0;
    }
}
