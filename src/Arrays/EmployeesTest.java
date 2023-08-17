package Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class EmployeesTest {

    @Autowired
    Employees employees=new Employees();
    @Test
    void getName() {
        String s="Mukesh";
        assertEquals(s,employees.getName());
    }

    @Test
    void setName() {
        String s="Mukesh";
        assertEquals("Mukesh",employees.getName());
        employees.setName("Mukesh");
    }

    @Test
    void getAddress() {
        employees.setAddress("DD");
        assertEquals("DD",employees.getAddress());
        employees.setId(88);
        employees.getId();
        employees.toString();
    }
}