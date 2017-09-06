package ivan;

import java.util.Scanner;

public class _03_Employee_Data {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        Integer age = Integer.parseInt(input.nextLine());
        Integer employeeID = Integer.parseInt(input.nextLine());
        Double monthlySalary = Double.parseDouble(input.nextLine());

        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Employee ID: %08d\n", employeeID);
        System.out.printf("Salary: %.2f\n", monthlySalary);
    }
}
