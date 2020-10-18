public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(){}

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
