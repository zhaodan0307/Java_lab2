/**Class Purpose: the class named HourlyEmployee extends the class Employee
 * The class inherits 3 instance variables firstName,lastName and socialInsuranceNumber from class Employee
 * and has its own instance variables hours and wage.
 * The class has setter and getter for the instance variables.
 * The class implements the abstract method earnings() of class Employee
 * and override the toString() method.
 *
 * Author: Dan Zhao
 * Date:17th Feb 2021
 * */
public class HourlyEmployee extends Employee{
    //instance variables
    private double hours;
    private double wage;
    //constructor
    public HourlyEmployee(String firstName, String lastName, int socialInsuranceNumber, double hours, double wage) {
        super(firstName, lastName, socialInsuranceNumber);
        this.hours = hours;
        this.wage = wage;
    }
    //setter and getter
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours<0){
            throw new IllegalArgumentException("The hours must be positive");
        }else{
            this.hours = hours;
        }

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage<0){
            throw new IllegalArgumentException("The wage must be positive");
        }else{
            this.wage=wage;
        }
    }

    //implement the Employee class's abstract method: earnings()
    @Override
    public double earnings() {
        double earning=0.0;
        if(hours<=40){
            earning= getWage()*getHours();
        }else if(hours>40){
            earning= 40*getWage()+(getHours()-40)*getWage()*1.5;
    }
        return earning;
    }
    //override the toString() method
    @Override
    public String toString() {
        return ("Hourly Employee's first name:"+super.getFirstName()+"\n"+
                "Hourly Employee's last name:"+super.getLastName()+"\n"+
                "Social Insurance Number:"+super.getSocialInsuranceNumber()+"\n"+
                "hourly wage:"+getWage()+"\n"+
                "hours worked:"+getHours()+"\n"
                );
    }

}
