package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));;
        System.out.println(checkForPalindrome("hello"));;
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }

    public static boolean checkForPalindrome(String string){
        string = string.replaceAll("[.,?!_\\s+-]", "").replace("I","i").toLowerCase();
        StringBuilder reverseString = new StringBuilder(string).reverse();
        if(string.equals(reverseString.toString())){
            return true;
        }
        return false;
    }

    public static String convertDecimalToBinary(int num){
        StringBuilder binary = new StringBuilder();
        while(num>0){
            int remainder = num % 2;
            binary.append(remainder);
            num /= 2;
        }

        return binary.reverse().toString();
    }

}