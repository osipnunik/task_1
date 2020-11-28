import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ProgramTest {

    @Test
    public void testDev95(){
        Employee dev = new Developer(1, "vasiliy", "Buriak", 2000, 95);
        Employee manager = new Manager(2, "Ivan", "Ivanov", 20000, 105);
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(dev);
        employees.add(manager);
        Accountant accountant = new Accountant(employees);
        int actualSumWage = accountant.entireWageOfAllEmployees();
        Assert.assertEquals(21900, actualSumWage);
    }

    @Test
    public void testDev105(){
        Employee dev = new Developer(1, "vasiliy", "Buriak", 2000, 105);
        Employee manager = new Manager(2, "Ivan", "Ivanov", 20000, 95);
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(dev);
        employees.add(manager);
        Accountant accountant = new Accountant(employees);
        int actualSumWage = accountant.entireWageOfAllEmployees();
        Assert.assertEquals(22095, actualSumWage);
    }

}
