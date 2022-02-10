package managementTests;

import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mr Bean", "JS363923B", 30000.00, "Sanitation");
    }

    @Test
        public void hasName(){
            assertEquals("Mr Bean", manager.getName());
        }

    @Test
    public void hasNiNumber(){
        assertEquals("JS363923B", manager.getNiNumber());
    }

        @Test
        public void hasSalary(){
            assertEquals(30000.00, manager.getSalary(), 0.1);
        }

        @Test
        public void hasDeptName(){
            assertEquals("Sanitation", manager.getDeptName());
        }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(30000.00);
        assertEquals( 60000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300.00, manager.payBonus(), 0.1);
    }

}
