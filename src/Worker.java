import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;
//  protected String endDate; //Making it protected will give a subclass the flexibility to operate on it


    private HourlyEmployee hourlyEmployee;
    private Employee employee;

//    Empty Constructor
    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate, String endDate, Employee employee, HourlyEmployee hourlyEmployee ) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
        this.employee = employee;
        this.hourlyEmployee = hourlyEmployee;

    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getAge() {

        // Assuming the birthDate is in the format "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedBirthDate = LocalDate.parse(this.birthDate, formatter);

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - parsedBirthDate.getYear();
//        int currentYear = 2025;
//        int birthYear = Integer.parseInt(birthDate.substring(6));
//        return (currentYear - birthYear);
        return age;
    }


//    public double collectPay() {
//        int pay = 0;
//        if ( employee.getEmployeeId() == 1) {
//            pay = 5000;
//            return pay;
//        }
//        else
//            return hourlyEmployee.getDoublePay();
//
//    }

    public double collectPay() {
        if (employee != null && employee.getEmployeeId() == 1) {
            return 5000; // Assuming fixed pay for employee ID 1
        } else if (hourlyEmployee != null) {
            return hourlyEmployee.getDoublePay();
        } else {
            return 0; // Or handle the case when both employee and hourlyEmployee are null
        }
    }


    public void terminate(String endDate){
        if(this.endDate == endDate){
            System.out.println("Contract has been terminated");
        }else
            System.out.println("Contract is still active");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}