package clase;

public class LaCapatLinie implements State{

    @Override
    public void schimbaStare(Autobuz autobuz) {
        if(!(autobuz.getStare() instanceof LaCapatLinie)){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este la capat de linie!");
            autobuz.setStare(this);
        } else{
            System.out.println("Autobuzul nu poate ajunge la capat de linie!");
        }
    }
}
