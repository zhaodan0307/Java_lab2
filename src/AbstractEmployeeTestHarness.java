/**Class Purpose: This class named AbstractEmployeeTestHarness is for testing the classes:
 * SalariedEmployee,HourlyEmployee,CommissionEmployee and BasePlusCommissionEmployee
 * There are 4 tests totally.Each test has 3 processes.
 * First,it's initialize a new object,
 * Second,call the method earnings () and print it
 * Third, call the method toString() and print it
 *
 * Author: Dan Zhao
 * Date: 17th Feb 2021
 * */

public class AbstractEmployeeTestHarness {
    public static void main(String[] args) {
        //Test 1 for SalariedEmployee class
        SalariedEmployee salariedEmployee = new SalariedEmployee("John","Lee",
                250450023,1500.00);
        //print the salaried employee's earnings
        System.out.println("The weekly earning of salariedEmployee: "+salariedEmployee.earnings());
        //print the information of salariedEmployee
        System.out.println(salariedEmployee.toString());


        //Test 2 for HourlyEmployee class
        HourlyEmployee hourlyEmployee= new HourlyEmployee("Tom","Jackson",
                901234876,16.5,19.5);
        //Print the Hourly Employee's earnings
        System.out.println("The earning of hourlyEmployee:"+hourlyEmployee.earnings());
        //Print the information of hourlyEmployee
        System.out.println(hourlyEmployee.toString());

        //Test 3 for CommissionEmployee class
        CommissionEmployee commissionEmployee = new CommissionEmployee("Lily","Mask",
                209876345,0.12,20000.50);
        //Print the CommissionEmployee's earning
        System.out.println("The earning of commissionEmployee:"+commissionEmployee.earnings());
        //Print the information of commissionEmployee
        System.out.println(commissionEmployee.toString());


        //Test 4 for BasePlusCommissionEmployee class
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Alex","Carl",
                980222367,0.13,18000.00,1000.5 );
        //Print the base+commission employee's earning
        System.out.println("The earning of basePlusCommissionEmployee:"+basePlusCommissionEmployee.earnings());
        //Print the information of basePlusCommissionEmployee
        System.out.println(basePlusCommissionEmployee.toString());
    }
}
