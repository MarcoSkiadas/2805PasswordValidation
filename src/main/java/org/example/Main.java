package org.example;

/** checkPasswordDigits
 * checkPasswordCases
 * checkCommonPassword
 */


public class Main {
    public static void main(String[] args) {
        System.out.println(checkPasswordDigits("Test1234"));
    }
    public static boolean checkPasswordLength(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
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
}