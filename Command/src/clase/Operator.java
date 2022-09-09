package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Comanda> listaComenzi;

    public Operator() {
        listaComenzi=new ArrayList<>();
    }

    public void adauga(Comanda c){
        listaComenzi.add(c);
    }

    public void executaComanda(){
       if(listaComenzi.isEmpty()){
           listaComenzi.get(0).executa();
           listaComenzi.remove(0);
       } else{
           System.out.println("Nu exista comenzi de executat!");
       }
    }
}
