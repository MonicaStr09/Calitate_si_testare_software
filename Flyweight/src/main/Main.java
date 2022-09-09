package main;

import clase.Linie;
import clase.LinieFactory;
import clase.ModelAutobuz;

public class Main {

    public static void main(String[] args) {
        ModelAutobuz a1=new ModelAutobuz("Mercedes", 2020, 35);
        ModelAutobuz a2=new ModelAutobuz("Bmw", 2021, 45);
        ModelAutobuz a3=new ModelAutobuz("Renault", 2022, 55);
        ModelAutobuz a4=new ModelAutobuz("Volvo", 2023, 60);

        LinieFactory linieFactory=new LinieFactory();

        linieFactory.getLinie(100).afiseazaDescriere(a1);
        linieFactory.getLinie(101).afiseazaDescriere(a2);
        linieFactory.getLinie(101).afiseazaDescriere(a3);
        linieFactory.getLinie(100).afiseazaDescriere(a4);


    }
}
