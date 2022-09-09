package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {
    @Test
    public void test(){
        Matematica math=new Matematica();
        int suma;
        suma=math.suma(3,10);
        assertEquals(13,suma);
    }
}