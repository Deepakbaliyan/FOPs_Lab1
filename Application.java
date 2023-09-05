package com.greatlearning;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = sc.nextLine();
        System.out.println("Please enter last name:");
        String lastName = sc.nextLine();
        Employee employee = new Employee(firstName, lastName);
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int userInput = sc.nextInt();
        CredentialService credentialService = new CredentialService();
        switch (userInput) {
            case 1:
                credentialService.showCredentials(employee, "tech");
                break;
            case 2:
                credentialService.showCredentials(employee, "admin");
                break;
            case 3:
                credentialService.showCredentials(employee, "humanresource");
                break;
            case 4:
                credentialService.showCredentials(employee, "legal");
                break;
            default:
                System.out.println("Invalid user input.");
        }
        
        sc.close();
    }
}