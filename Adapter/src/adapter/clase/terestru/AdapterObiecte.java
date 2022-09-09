package adapter.clase.terestru;

import adapter.clase.subteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru{
   private ValidatorMetrou validatorMetrou;

    public AdapterObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
       validatorMetrou.valideazaAbonament();
    }
}
