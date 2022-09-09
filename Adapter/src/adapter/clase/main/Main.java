package adapter.clase.main;

import adapter.clase.subteran.ValidatorMetrou;
import adapter.clase.terestru.AdapterObiecte;
import adapter.clase.terestru.ValidatorAdapter;
import adapter.clase.terestru.ValidatorAutobuz;
import adapter.clase.terestru.ValidatorTerestru;

public class Main {

    static void valideazaBiletCalatorie(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorAutobuz validatorAutobuz=new ValidatorAutobuz();
        //valideazaBiletCalatorie(validatorAutobuz);
        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
        AdapterObiecte adapterObiecte=new AdapterObiecte(validatorMetrou);
        valideazaBiletCalatorie(adapterObiecte);
        ValidatorAdapter validatorAdapter=new ValidatorAdapter();
        valideazaBiletCalatorie(validatorAdapter);
    }
}
