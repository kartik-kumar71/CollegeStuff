import java.util.ArrayList;
import java.util.List;
class Employee {
 
    private String name;
    private String account;
    private Integer salary;
 
    public Employee(String name, String account, Integer salary) {
        super();
        this.name = name;
        this.account = account;
        this.salary = salary;
    }
	
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAccount() {
        return account;
    }
 
    public void setAccount(String account) {
        this.account = account;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
	@Override
    public String toString() {
 
        return "name: "+ this.name +" | account: "+ this.account +" | salary: "+this.salary;
    }
}
public class Stream8{
 
    public static void main(String a[]) {
 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Admin", 12500));
 
        empList.stream().filter(emp->emp.getAccount().matches("Admin"))
                        .findFirst()
                        .ifPresent(System.out::println);
 
        empList.stream().filter(emp->emp.getAccount().matches("Admin"))
                        .findAny()
                        .ifPresent(System.out::println);
    }
}