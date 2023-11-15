import java.text.DecimalFormat;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, Employee employee,   long employeeId, String hireDate,double annualSalary,boolean isRetired) {
        super(name, birthDate, endDate, employee,employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
//        double weeklyPay = annualSalary / 26;
//
//        // Using DecimalFormat to round the value to two decimal places
//        DecimalFormat df = new DecimalFormat("#.##");
//        return Double.parseDouble(df.format(weeklyPay));
        double payCheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck :payCheck;
                // Using DecimalFormat to round the value to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(adjustedPay));


    }

    public void retire(){
        terminate("2025-12-12");
        isRetired = true;
        if (this.isRetired == true){
            System.out.println("Salary Employee has retired");
        }else
            System.out.println("Salary Employee has not retired");
    }
}
