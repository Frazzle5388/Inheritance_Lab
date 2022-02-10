package managementTests;

import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("The Honey Monster", "SP846321K", 100000.00, "Sanitation", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("The Honey Monster", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("SP846321K", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sanitation", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(500000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(30000.00);
        assertEquals( 130000.00, director.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000.00, director.payBonus(), 0.1);
    }



}
