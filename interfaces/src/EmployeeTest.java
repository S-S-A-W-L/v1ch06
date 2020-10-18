import java.util.Arrays;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker",35000d);
        staff[1] = new Employee("Carl Cracker",75000d);
        staff[2] = new Employee("Tony Tester",38000d);

        Arrays.sort(staff);

        for (Employee employee:staff) {
            System.out.println("name="+employee.getName()+","+"salary="+employee.getSalary());
        }
    }
}
