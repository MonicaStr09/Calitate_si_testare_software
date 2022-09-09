package main;

import facade.Autobuz;
import facade.Facade;

public class Main {

    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
       // Facade facade=new Facade();
        Facade.deschideUsi(autobuz);
        Facade.puneLiberUsi(autobuz);
    }

}
