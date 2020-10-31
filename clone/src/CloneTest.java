public class CloneTest {
    public static void main(String[] args) {
        Employee origin = new Employee("John Q.Public",50000d);
        origin.setHireDate(2019,10,31);
        try{
            Employee cloned = origin.clone();
            cloned.raiseSalary(10d);
            cloned.setHireDate(2020,10,31);

            System.out.println("origin="+origin);
            System.out.println("cloned="+cloned);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
