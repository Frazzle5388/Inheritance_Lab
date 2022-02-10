package techStaffTests;

import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Taggart", "YX129845K", 10500.00);
    }

    @Test
    public void hasName(){
        assertEquals("Taggart", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("YX129845K", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(10500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(15000.00);
        assertEquals( 25500.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(105.00, databaseAdmin.payBonus(), 0.1);
    }
}
