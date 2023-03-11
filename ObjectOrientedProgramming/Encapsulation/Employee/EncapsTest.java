package ObjectOrientedProgramming.Encapsulation.Employee;

public class EncapsTest {
    public static void main(String[] args) {
        // set employee instance
        EncapsulationDemo employee = new EncapsulationDemo();

        employee.setEmpAge(21);
        employee.setEmpName(" Titus");
        employee.setSSN(212121);

        // print employee details
        System.out.println("Employee name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
        System.out.println("Employee SSN: " + employee.getSSN());
    }

}
