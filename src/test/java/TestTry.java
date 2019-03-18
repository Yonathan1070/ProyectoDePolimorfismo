/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.ejercico4.Try;
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
public class TestTry {
    Try t=new Try();
    public TestTry() throws IOException{
        
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
    // public void hello() {}
    @Test
    public void testBuscarAbuelo(){
            String resultadoCorrecto="Abuelo: david\n" +
                                     "Padre: Luis\n" +
                                     "Hijo: juan";
        String resultadoObtenido=t.rta;
        assertEquals(resultadoCorrecto, resultadoObtenido);
    }
}
