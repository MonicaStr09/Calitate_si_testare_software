package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareInCursa;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a=new Autobuz("OT09STR");
        Autobuz a2=new Autobuz("OT09MON");
        Operator op=new Operator();
        Comanda comanda=new ComandaPlecareInCursa(a,2);
        Comanda comanda1=new ComandaPlecareInCursa(a2,3);
        Comanda comanda2=new ComandaPlecareInCursa(a,3);
        Comanda comanda3=new ComandaPlecareInCursa(a2,4);
        op.adauga(comanda);
        op.adauga(comanda1);
        op.adauga(comanda2);
        op.adauga(comanda3);
        op.executaComanda();
        op.executaComanda();
    }
}
