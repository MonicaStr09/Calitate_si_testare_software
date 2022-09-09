package testCase;

import clase2.PachetTuristic;
import org.junit.Test;
import testare.dubluri.PersoanaFakeCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestarePachetCase {
    @Test
    public void testarePoateRezerva(){
        PersoanaFakeCase persoanaFakeCase=new PersoanaFakeCase();
        persoanaFakeCase.setVarsta(20);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFakeCase,"Japonia",2000.0);
        assertTrue(pachetTuristic.poateRezerva());

    }

    @Test
    public void testBoundry(){
        PersoanaFakeCase persoanaFakeCase=new PersoanaFakeCase();
        persoanaFakeCase.setVarsta(18);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFakeCase,"Maldive", 6000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testDiscountFake(){
        PersoanaFakeCase persoanaFakeCase=new PersoanaFakeCase();
        persoanaFakeCase.setVarsta(80);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFakeCase,"Maldive", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void testNuAplicaDiscount(){
        PersoanaFakeCase persoanaFakeCase=new PersoanaFakeCase();
        persoanaFakeCase.setVarsta(20);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFakeCase,"Maldive", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(200.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void testDiscountBoundry(){
        PersoanaFakeCase persoanaFakeCase=new PersoanaFakeCase();
        persoanaFakeCase.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFakeCase,"Maldive", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void testIncaUnDiscountBoundry(){
        PersoanaFakeCase persoanaFakeCase=new PersoanaFakeCase();
        persoanaFakeCase.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFakeCase,"Maldive", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0,pachetTuristic.getPret(),0.01);
    }
}
