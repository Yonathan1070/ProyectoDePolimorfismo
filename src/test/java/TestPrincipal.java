/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.ejercico4.Principal;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fetec
 */
public class TestPrincipal {
    
    Principal p;
    
    public TestPrincipal()throws IOException{
        p=new Principal();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() 
    @Test
    public void testBuscarAbuelo(){
        
        String resultadoCorrecto="Es la cedula del abuelo: camila\n" +
                                 "Su hijo es: Luis\n" +
                                 "Su nieto es: juan\n";
        String resultadoObtenido=p.buscar(9);
        assertEquals(resultadoCorrecto, resultadoObtenido);
    
    }
    @Test
    public void testBuscarPadre(){
        
        String resultadoCorrecto="Es la cedula del Padre: Roberto\n" +
                                 "Su padre es: camila\n" +
                                 "Su hijo es: Victor\n";
        String resultadoObtenido=p.buscar(6);
        assertEquals(resultadoCorrecto, resultadoObtenido);
    
    }
    
    @Test
    public void testBuscarHijo(){
        
        String resultadoCorrecto="Es la cedula del Hijo: Victor\n" +
                                 "Su padre es: Roberto\n" +
                                 "Su abuelo es: camila\n";
        String resultadoObtenido=p.buscar(3);
        assertEquals(resultadoCorrecto, resultadoObtenido);
    
    }
}
