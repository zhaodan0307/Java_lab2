/** Class Purpose: The class named Employee is an abstract class.
 * It contains 3 instance variables and setter, getter for each one
 * It also have a abstract earnings();
 * It also overrides the toString method.
 * Author: Dan Zhao
 * Date:Feb 16th 2021
 *  */

public  abstract class Employee {
    //three instance variables
    private String firstName,lastName;
    private int socialInsuranceNumber;

    //constructor
    public Employee(String firstName, String lastName, int socialInsuranceNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialInsuranceNumber = socialInsuranceNumber;
    }
    //getter and setter
    public int getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public void setSocialInsuranceNumber(int socialInsuranceNumber) {
        if(socialInsuranceNumber<=0){
            throw new IllegalArgumentException("The social insurance number must be positive");
        }else{
            this.socialInsuranceNumber = socialInsuranceNumber;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){

        if (this.firstName.matches("s[a-z A-Z]+"))
        {
            this.firstName = firstName;
        }else{
            //System.out.println("Please enter the letters only");

            throw new IllegalArgumentException("Please enter the letters only");
        }



    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName) {
        if(ifAlphabetOnly(lastName))
            this.firstName = firstName;
        else{
            System.out.println("Please input the letter only");
        }
    }

    //utility methods
    //String validation method
    private boolean ifAlphabetOnly(String str){
        return str.chars().allMatch(Character :: isLetter);
    }

    //override the toString method
    @Override
    public String toString(){
        return ("firstName:"+getFirstName()+" lastName:"+getLastName()+" Social Insurance Number:"+getSocialInsuranceNumber());
    }
    //abstract method earnings
    public abstract double earnings();


}
