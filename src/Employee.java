public class Employee extends Worker{

    public long employeeId;
    private String hireDate;
    protected static int employeeNo = 1;

    public Employee(String name, String birthDate,String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    public Employee(String name, String birthDate, String endDate, Employee employee, long employeeId, String hireDate) {
        super(name, birthDate, endDate,employee,null);
        this.employeeId = employeeId;
        this.hireDate = hireDate;

    }


    public long getEmployeeId() {
        return this.employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
