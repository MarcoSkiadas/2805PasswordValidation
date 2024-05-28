package org.example;

import java.util.Scanner;

/** checkPasswordDigits
 * checkPasswordCases
 * checkCommonPassword
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        System.out.println(passwordFeedback(password));

    }
    public static boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }
    public static boolean checkPasswordDigits(String password) {
       for (int i = 0; i < password.length(); i++) {
           if (Character.isDigit(password.charAt(i))) {
               return true;
           }
       }
       return false;
    }
    public static boolean checkPasswordUpperCases(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkPasswordLowerCases(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
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
    public static boolean checkSpecialCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
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