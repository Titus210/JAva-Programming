package ObjectOrientedProgramming.Encapsulation.Employee;

public class EncapsulationDemo {
    private int SSN;
    private String empName;
    private int empAge;

    // declare setters
    public int getSSN() {
        return SSN;
    }

    public String getEmpName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }

    // declare getters

    // set employee ssn
    public void setSSN(int ssnValue){
        SSN = ssnValue;
    }
    // set employee age
    public void setEmpAge(int ageValue){
        empAge = ageValue;
    }
    // set employee name
    public void setEmpName(String nameValue){
        nameValue = empName;
    }

}

