package main;

import clase.Autobuz;
import clase.InCursa;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(10);
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ieseDinService();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();

    }
}
