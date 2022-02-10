package techStaffTests;

import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mr T", "BC121018C", 45000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Mr T", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("BC121018C", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(45000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(15000.00);
        assertEquals( 60000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(450.00, developer.payBonus(), 0.1);
    }


}
