/**Class Purpose: the class named BasePlusCommissionEmployee extends the class CommissionEmployee
 * The class inherits 5 instance variables firstName,lastName and socialInsuranceNumber from class Employee
 * and commissionRate and grossSales from class CommissionEmployee
 * The class has its own instance variable baseSalary.
 * The class has setter and getter for the instance variables.
 * The class implements the abstract method earnings() of class Employee
 * and override the toString() method.
 *
 * Author: Dan Zhao
 * Date:17th Feb 2021
 * */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    //instance variables
    private double baseSalary;
    //constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, int socialInsuranceNumber, double commissionRate, double grossSales, double baseSalary) {
        super(firstName, lastName, socialInsuranceNumber, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }
    //setter and getter
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<=0){
            throw new IllegalArgumentException("The base salary must be positive");
        }else{
            this.baseSalary = baseSalary;
        }

    }
    //implement the Employee class's abstract method: earnings()
    @Override
    public double earnings() {
        return super.earnings()+getBaseSalary();
    }
    //override the toString() method
    @Override
    public String toString() {
        return( "Base Salaried Commission Employee's first name:"+super.getFirstName()+"\n"+
                "Base Salaried Commission Employee's last name:"+super.getLastName()+"\n"+
                "Social Insurance Number:"+super.getSocialInsuranceNumber()+"\n"+
                "Gross Sales:"+super.getGrossSales()+"\n"+
                "Commission Rate"+super.getCommissionRate()+"\n"+
                "Base Salary:"+getBaseSalary()+"\n"
                );
    }
}
