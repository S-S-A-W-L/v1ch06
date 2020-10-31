import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
    private String name;
    private Double salary;
    private Date hireDate;

    public Employee(String name,Double salary){
        this.name = name;
        this.salary = salary;
        hireDate = new Date();
    }

    public Employee clone()throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) hireDate.clone();
        return cloned;
    }

    public void setHireDate(int year,int month,int day){
        Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
        hireDate.setTime(newHireDay.getTime());
    }

    public void raiseSalary(Double percent){
        double raise = salary * percent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
