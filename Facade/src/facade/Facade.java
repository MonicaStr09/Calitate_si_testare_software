package facade;

public class Facade {

    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.puneliberUsaSpate();
        autobuz.deschideUsaMijloc();
    }

    public static void puneLiberUsi(Autobuz autobuz){
        autobuz.puneliberUsaFata();
        autobuz.puneliberUsaMijloc();
        autobuz.deschideUsaSpate();
    }
}
