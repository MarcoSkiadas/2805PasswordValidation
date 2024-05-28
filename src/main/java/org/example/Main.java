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
    public static boolean checkCommonPassword(String password) {
        String common[] = {"password","swordfish","test"};
        String passwordLow = password.toLowerCase();
        for(int i=0;common.length>i;i++ ) {
            if (passwordLow.contains(common[i])) {
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
    // soll eine Zahl / Zeichen /soll ein Case sein / bekannte Wörter
}