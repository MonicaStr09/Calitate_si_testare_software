package testare.teste;

import clase2.AgentieTurism;
import clase2.IPachet;
import clase2.PachetTuristic;
import org.junit.Test;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetStub;

import static org.junit.Assert.*;

public class AgentieTurismTest {

    @Test
    public void testAdaugaPachet(){
        AgentieTurism a=new AgentieTurism();
        IPachet dummy=new PachetDummy();

        a.adaugaPachet(dummy);
        assertEquals(1,a.calculareSumaTotalaPachete());
    }

    @Test
    public void testCalculareSumaTotalaPachete(){
        AgentieTurism agentieTurism=new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());
        assertEquals(2000.0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    public void testCalculareSumaTotalaPacheteFake(){
        AgentieTurism agentieTurism=new AgentieTurism();
        PachetFake pachetFake=new PachetFake();
        PachetFake pachetFake1=new PachetFake();

        pachetFake.setPret(100.0);
        pachetFake1.setPret(300.0);

        agentieTurism.adaugaPachet(pachetFake);
        agentieTurism.adaugaPachet(pachetFake1);

        assertEquals(400.0, agentieTurism.calculareSumaTotalaPachete());

    }

}