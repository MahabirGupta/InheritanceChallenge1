public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String endDate, Employee employee, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employee, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;

    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getDoublePay(){
//        double pay = this.hourlyPayRate * 2;
//        return pay;
        return 2 * collectPay();
    }

    @Override
    public double collectPay() {
        return 40*hourlyPayRate;
    }
}
