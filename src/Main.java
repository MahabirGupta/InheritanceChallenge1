public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("John", "1981-02-10", "2021-04-30", null, 1,"2021-09-06");
//        HourlyEmployee hourlyEmployee = new HourlyEmployee("John", "1981-02-10", "2021-04-30", employee, 1, "2021-09-06", 0);
//
//        Worker worker = new Worker("John", "1981-02-10", "2021-04-30", employee,hourlyEmployee);

        System.out.println(employee);
        System.out.println("Age = " + employee.getAge());
        System.out.println("Pay = " + employee.collectPay());

        Employee employee1 = new Employee("Susy","1975-03-12","2026-03-15",employee, 0,"2016-03-15" );

        // Increment the employeeNo for the new employee and assign it
        employee1.employeeId = ++Employee.employeeNo;
        System.out.println(employee1);

        SalariedEmployee employee2 = new SalariedEmployee("Alex","1965-05-20","2027-09-25",employee, 0,"2018-04-19" ,35000,false);

        // Increment the employeeNo for the new employee and assign it
        employee2.employeeId = ++Employee.employeeNo;
        System.out.println(employee2);
        System.out.println(employee2.getName() + "'s salary is $" + employee2.collectPay());
                employee2.retire();
        System.out.println(employee2.getName() + "'s pension is $" + employee2.collectPay());

        System.out.println();

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tom","1994-01-15","2025-04-09",null,0,"2010-03-09",15);
        hourlyEmployee.employeeId = ++Employee.employeeNo;
        System.out.println(hourlyEmployee);
        System.out.println(hourlyEmployee.getName() + "'s salary is $" + hourlyEmployee.collectPay());
        System.out.println(hourlyEmployee.getName() + "'s pension is $" + hourlyEmployee.getDoublePay());



//        System.out.println(worker.getName() +"'s age is " + worker.getAge());
//        System.out.println(worker.getName()+ "'s salary is $" + worker.collectPay());
//        System.out.println(worker.getName() + " is a Salaried Employee whose pay is $" + worker.collectPay());
//
//        worker.terminate("2021-02-24");
//        worker.toString();
//        System.out.println();
//
//        Employee employee1 = new Employee("Mary", "1987-01-01", "2020-05-25", null, 2,"2022-04-26");
//        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Mary","1987-01-01","2020-05-25",employee1,2,"2022-04-26",7);
//        Worker worker1 = new Worker("Mary","1987-01-01","2020-05-25",employee1,hourlyEmployee1);
//        System.out.println(worker1.getName()+"'s age is " + worker1.getAge());
//        System.out.println(worker1.getName()+ "'s salary is $" + worker1.collectPay());
//        System.out.println(worker1.getName() + " is an Hourly Employee whose pay is $" + hourlyEmployee1.getDoublePay());
//        worker1.terminate("2020-05-25");
//
//
//
//
//        System.out.println();
//
//        SalariedEmployee salariedEmployee = new SalariedEmployee("David","1978-01-10","2025-11-5",employee,3,"2010-07-15",8500,true);
//        System.out.println(salariedEmployee.getName() + " is a Salaried Employee");
//        System.out.println(salariedEmployee.getName() + " has retired");
//        salariedEmployee.retire();
//
//        System.out.println();
//
//        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Vijay","1974-08-20","2022-08-03",employee,4,"2015-06-29",2350,false);
//        System.out.println(salariedEmployee1.getName() + " is a Salaried Employee");
////        System.out.println(salariedEmployee.getName() + " has retired");
//        salariedEmployee1.retire();

    }
}
