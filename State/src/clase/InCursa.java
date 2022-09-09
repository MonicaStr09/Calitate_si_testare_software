package clase;

public class InCursa implements State{

    @Override
    public void schimbaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatLinie){
            System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" a plecat in cursa!");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul nu poate pleca in cursa!");
        }
    }
}
