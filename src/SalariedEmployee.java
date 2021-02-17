/**Class Purpose: the class named SalariedEmployee extends the class Employee
 * The class inherits 3 instance variables firstName,lastName and socialInsuranceNumber from class Employee
 * and has its own instance variable weeklySalary.
 * The class has setter and getter for the instance variables.
 * The class implements the abstract method earnings() of class Employee
 * and override the toString() method.
 *
 * Author: Dan Zhao
 * Date:17th Feb 2021
 * */

public class SalariedEmployee extends Employee{
    //instance variables
    private double weeklySalary;

    //constructor
    public SalariedEmployee(String firstName, String lastName, int socialInsuranceNumber, double weeklySalary) {
        super(firstName, lastName, socialInsuranceNumber);
        this.weeklySalary = weeklySalary;
    }

    //setter
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<=0){
            throw new IllegalArgumentException("The weekly salary must be positive");
        }else{
            this.weeklySalary = weeklySalary;
        }
    }
    //implement the Employee class's abstract method: earnings()
    @Override
    public double earnings() {
        return  weeklySalary;
    }
    //override the toString() method
    @Override
    public String toString() {
        return ("Salaried Employee's first name:"+super.getFirstName()+"\n"+
                "Salaried Employee's last name:"+super.getLastName()+"\n"+
                "Social Insurance Number:"+super.getSocialInsuranceNumber()+"\n"+
                "Weekly salary:"+earnings()+"\n");
    }
}
