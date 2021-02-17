/**Class Purpose: the class named CommissionEmployee extends the class Employee
 * The class inherits 3 instance variables firstName,lastName and socialInsuranceNumber from class Employee
 * and has its own instance variables commissionRate and grossSales.
 * The class has setter and getter for the instance variables.
 * The class implements the abstract method earnings() of class Employee
 * and override the toString() method.
 *
 * Author: Dan Zhao
 * Date:17th Feb 2021
 * */

public class CommissionEmployee extends Employee{
    //instance variables
    private double commissionRate;
    private double grossSales;
    //constructor
    public CommissionEmployee(String firstName, String lastName, int socialInsuranceNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialInsuranceNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }


    //setter and getter
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate<=0){
            throw new IllegalArgumentException("The commission rate must be positive");
        }else{
            this.commissionRate = commissionRate;
        }

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales<0){
            throw new IllegalArgumentException("The gross sales must be positive");
        }else{
            this.grossSales = grossSales;
        }
    }

    //implement the Employee class's abstract method: earnings()
    @Override
    public double earnings() {
        return getCommissionRate()*getGrossSales();
    }

    //override the toString() method
    @Override
    public String toString() {
        return ("Commission Employee's first name:"+super.getFirstName()+"\n"+
                "Commission Employee's last name:"+super.getLastName()+"\n"+
                "Social Insurance Number:"+super.getSocialInsuranceNumber()+"\n"+
                "Gross Sales:"+getGrossSales()+"\n"+
                "Commission Rate"+getCommissionRate()+"\n"
                );
    }
}
