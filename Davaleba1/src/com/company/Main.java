package com.company;

import java.sql.Array;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void First(){
        System.out.println("----------------------------------------------------------");
        System.out.println("1)\nC++\nC#\nJava\npascal\nPHP\nJavaScript\nActionScript");
        System.out.println("----------------------------------------------------------");
    }

    public static void Second(){
        System.out.print("პირველი რიცხვი: ");
        Scanner sc_1 = new Scanner(System.in);
        int num1 = sc_1.nextInt();
        System.out.print("მეორე რიცხვი: ");
        Scanner sc_2 = new Scanner(System.in);
        int num2 = sc_2.nextInt();
        System.out.println("პირველის მეორეზე გაყოფის შედეგი: " + num1 / num2);
        System.out.println("ნაშთი მეორეს პირველზე გაყოფისას არის: " + num2 % num1);
        System.out.println("----------------------------------------------------------");

    }
    public static void Third(){
        System.out.print("პირველი რიცხვი: ");
        Scanner sc_4 = new Scanner(System.in);
        int num3 = sc_4.nextInt();
        System.out.print("მეორე რიცხვი: ");
        Scanner sc_5 = new Scanner(System.in);
        int num4 = sc_5.nextInt();
        System.out.print("მესამე რიცხვი: ");
        Scanner sc_6 = new Scanner(System.in);
        int num5 = sc_6.nextInt();
        int d = num3 + num4 + num5;
        int c = num3 * num4 * num5;
        System.out.println("პირველის მეორეს და მესამეს მიმატების შედეგი: " + d);
        System.out.println("პირველის მეორეს და მესამეს ნამრავლი არის: " + c);
        System.out.println("----------------------------------------------------------");
    }

    public static void Forth(){
        Scanner sc_1 = new Scanner(System.in);
        System.out.print("Please Enter 3 Digit number: ");
        int num1 = sc_1.nextInt();
        String stringInput = String.valueOf(num1);

        if (stringInput.length() == 3) {
            for (int i = 0; i < stringInput.length(); i++) {
                int j = Character.digit(stringInput.charAt(i), 10);
                System.out.println(j);
            }
        }else{
            System.out.println("Something Went Wrong !");
        }

    }

    public static void Fifth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 Digit Number: ");
        int input = sc.nextInt();
        String stringInput = String.valueOf(input);
        if (stringInput.length() == 4) {
            int k = 0;
            for (int i = 0; i < stringInput.length(); i++) {
                int j = Character.digit(stringInput.charAt(i), 10);
                k = k + j;
            }
            System.out.println(k);
        }else {
            System.out.println("Something went wrong Please Try Again !");
        }
    }

    public static void Sixth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int input = sc.nextInt();
        String stringInput = String.valueOf(input);
        int k = 0;
        for (int i = 0; i<stringInput.length(); i++){
            int j = Character.digit(stringInput.charAt(i), 10);
            k = k + j;
        }
        System.out.println(k);
    }

    public static void Seventh(){

    }

    public static void Eighth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start Number: ");
        int input = sc.nextInt();
        Scanner sc_1 = new Scanner(System.in);
        System.out.print("End Number: ");
        int input_1 = sc_1.nextInt();
        for(int i = input; i < input_1 + 1; i++){
            System.out.println(i);
        }
    }

    public static void Ninth() {
        int[] array = {15, 2, 3, 24, 5, 56, 7, 2138, 9};
        System.out.println(Arrays.toString(array));
        int highest_in_array = array[0];
        int lower_in_array = array[0];
        for (int i = 0; i < array.length; i++) {
            int arr = array[i];
            if (highest_in_array < arr) {
                highest_in_array = arr;
            }
            if (lower_in_array > arr){
                lower_in_array = arr;
            }
        }
        System.out.println(highest_in_array);
        System.out.println(lower_in_array);
    }

    public static void Tenth(){
        int[] array = {123, 214, 1512, 12, 33, 654, 891, 1};
        System.out.println("Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void Eleventh(){
        int[] array = new int[8];
        Random randnumb = new Random();
        for(int i=0; i<8; i++){
            array[i] = randnumb.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void Twelfth() {
        return;
    }

    public static void main(String[] args) {
        // write your code here
//        First();
//        Second();
//        Third();
//        Forth();
//        Fifth();
//        Sixth();
//        Seventh();
//        Eighth();
//        Ninth();
//        Tenth();
//        Eleventh();
//        Twelfth();
    }

}
