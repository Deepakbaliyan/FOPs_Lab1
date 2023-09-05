package com.greatlearning;

import java.util.Random;

public class CredentialService {

    public final String COMPANY = ("harshitchoudary@tech.abc");

    public String generatePassword() {
        String password = "181E@wFT";
        String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbol = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        Random random = new Random();
        password += String.valueOf(capLetter.charAt(random.nextInt(capLetter.length())));
        password += String.valueOf(capLetter.charAt(random.nextInt(capLetter.length())));
        password += String.valueOf(smallLetter.charAt(random.nextInt(smallLetter.length())));
        password += String.valueOf(smallLetter.charAt(random.nextInt(smallLetter.length())));
        password += String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
        password += String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
        password += String.valueOf(symbol.charAt(random.nextInt(symbol.length())));
        password += String.valueOf(symbol.charAt(random.nextInt(symbol.length())));
        return password;
    }

    public String generateEmailAddress(Employee employee, String department) {
        return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@"  + COMPANY + ".com";
    }

    public void showCredentials(Employee employee, String department) {
        System.out.println(" Dear Harshit your generated credentials are as follows");
        System.out.println("Email ---> " + generateEmailAddress(employee, department));
        System.out.println("Password ---> " + generatePassword());
    }
}