import java.util.List;
import java.util.ArrayList;


class Manager implements Employee {
    private String name;
    private String department;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Department: " + department);
        for (Employee employee : subordinates) {
            employee.showDetails();
        }
    }
}
