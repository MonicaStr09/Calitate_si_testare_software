package main;

import clase.Meniu;
import clase.SubCategorie;
import clase.SubCategorie;
import clase.TipAliment;

public class Main {

    public static void main(String[] args) {


        Meniu meniu=new Meniu("Meniu Mimi");


        TipAliment bauturi=new TipAliment("Bauturi");
        TipAliment paste=new TipAliment("Paste");
        TipAliment desert=new TipAliment("Desert");



        SubCategorie cat1=new SubCategorie("Inghetata");
        SubCategorie cat4=new SubCategorie("Tiramisu");
        SubCategorie cat2=new SubCategorie("Carbonara");
        SubCategorie cat3=new SubCategorie("apa");


        meniu.adaugaItem(desert);
        meniu.adaugaItem(paste);
        meniu.adaugaItem(bauturi);

        desert.adaugaItem(cat1);
        desert.adaugaItem(cat4);
        paste.adaugaItem(cat2);

        bauturi.adaugaItem(cat3);


        meniu.descriere();


    }

}