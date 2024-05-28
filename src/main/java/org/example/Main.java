package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Output with requested input from user to choose a Password
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        System.out.println(passwordFeedback(password));

    }
    //Check if the password length is True
    public static boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }
    //Check if the password contains digits
    public static boolean checkPasswordDigits(String password) {
       for (int i = 0; i < password.length(); i++) {
           if (Character.isDigit(password.charAt(i))) {
               return true;
           }
       }
       return false;
    }
    //Check the password if uppercases are contained
    public static boolean checkPasswordUpperCases(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    //Check the password if lowercases are contained
    public static boolean checkPasswordLowerCases(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    //check if this password contains commons words or is insecure
    public static boolean checkCommonPassword(String password) {
        String[] common = {"password","swordfish","test","hello"};
        String passwordLow = password.toLowerCase();
        for (String s : common) {
            if (passwordLow.contains(s)) {
                return false;
            }
        }
        if(!checkPasswordLength(password)) {
            return false;
        }
        else if(!checkPasswordUpperCases(password)) {
            return false;
        }
        else if(!checkPasswordLowerCases(password)) {
            return false;
        }
        else if(!checkPasswordDigits(password)) {
            return false;
        }
        return true;
    }
    //check if the password contains special Characters
    public static boolean checkSpecialCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    // Output Method to give the User feedback
    public static String passwordFeedback(String password) {
        if (!checkPasswordLength(password)) {
            return "Your Password: "+ password + " must contain at least 8 characters";
        }
        else if (!checkPasswordDigits(password)) {
            return "Your Password: "+ password + " must contain at least one number";
       }
        else if (!checkPasswordUpperCases(password)) {
            return "Your Password: "+ password + " must contain at least one uppercase";
        } else if (!checkPasswordLowerCases(password)) {
            return "Your Password: "+ password + " must contain at least one lowercase";
        }
        else if (!checkSpecialCharacters(password)) {
            return "Your Password: "+ password + " must contain at least one special character";
        } else if (!checkCommonPassword(password)) {
            return "Your Password: "+ password + " is insecure please try another one";
        }
        return "Your Password: " +password+" has been added";

    }
}