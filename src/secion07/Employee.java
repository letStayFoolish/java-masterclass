package secion07;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 770001;

    public Employee() {
        super("Irina", "21.10.1994");
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employed=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
