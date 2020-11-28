import java.util.Set;

public class Accountant {
    private Set<Employee> employees;

    public Accountant(Set<Employee> employees) {
        this.employees = employees;
    }

    public int entireWageOfAllEmployees(){
        int sumWage = 0;
        for (Employee employee: employees  ) {
           if(employee instanceof Developer){
               sumWage +=((Developer) employee).getWage();
           } else if(employee instanceof Manager){
               sumWage +=((Manager) employee).getWage();
           }
        }
        return sumWage;
    }
}
