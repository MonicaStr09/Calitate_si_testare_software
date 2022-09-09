package testare.dubluri;

import clase.IPersoana;

public class PersoanaFakeCase implements IPersoana {
    String sex;
    int varsta;
    boolean checkValoareCnp;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCheckValoareCnp(boolean checkValoareCnp) {
        this.checkValoareCnp = checkValoareCnp;
    }

    @Override
    public String getSex() throws Exception {
        return this.sex;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return this.checkValoareCnp;
    }
}
