/*
 * @autor: Jaqueline Ribeiro, Lorena Nascimento e Sarah Cabral
 * Controle Patrimonial
 */
package model.dao;

import model.bean.Instituicao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jaqueline
 */
public class InstituicaoDAOTest {
    
    public InstituicaoDAOTest() {
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

    /**
     * Test of create method, of class InstituicaoDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Instituicao ifpb =  new Instituicao("Campina Grande", "PB");
        InstituicaoDAO instance = new InstituicaoDAO();
        instance.create(ifpb);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class InstituicaoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Instituicao ifpb = null;
        InstituicaoDAO instance = new InstituicaoDAO();
        instance.delete(ifpb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
