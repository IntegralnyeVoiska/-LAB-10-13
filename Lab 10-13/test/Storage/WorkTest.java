/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Aircraft.*;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class WorkTest {

    public WorkTest() {
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
     * Test of getAllCapacityOfObject method, of class Work.
     */
    @Test
    public void testGetAllCapacityOfObject() {
        Storage dimasPolitasters = new Storage();
        Work instance = new Work();

        dimasPolitasters.add(Builder.createCargo("Рыжий", 400, 0));
        dimasPolitasters.add(Builder.createMilitary("Анархист", 200, 0));
        dimasPolitasters.add(Builder.createPassenger("Ради Гари 4ый подход", 100, 0));

        int expResult = 700;
        int result = instance.getAllCapacityOfObject(dimasPolitasters);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getAllCapacityOfPeople method, of class Work.
     */
    @Test
    public void testGetAllCapacityOfPeople() {
        Storage dimasPolitasters = new Storage();
        Work instance = new Work();

        dimasPolitasters.add(Builder.createCargo("Рыжий", 0, 1));
        dimasPolitasters.add(Builder.createMilitary("Анархист", 0, 1));
        dimasPolitasters.add(Builder.createPassenger("Ради Гари 4ый подход", 0, 2));

        int expResult = 4;
        int result = instance.getAllCapacityOfPeople(dimasPolitasters);
        assertEquals(expResult, result);
    }

}
