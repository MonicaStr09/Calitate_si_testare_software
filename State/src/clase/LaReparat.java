package clase;

public class LaReparat implements State{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatLinie){
            System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" merge la reparat!");
            autobuz.setStare(this);
        } else{
            System.out.println("Autobuzul nu poate fi trimis la reparat");
        }
    }
}
