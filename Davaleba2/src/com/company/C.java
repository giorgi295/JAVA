package com.company;

import java.util.Scanner;

public class C {
    Integer a;
    Integer b;
    Integer c;
    public void First() {
        Scanner sc_0 = new Scanner(System.in);
        System.out.print("Enter a: ");
        this.a = sc_0.nextInt();
        Scanner sc_1 = new Scanner(System.in);
        System.out.print("Enter b: ");
        this.b = sc_1.nextInt();
        Scanner sc_2 = new Scanner(System.in);
        System.out.print("Enter c: ");
        this.c = sc_2.nextInt();
    }

    public int Second() {
        String number_in_string = Integer.toString(this.a);
        int number_length = number_in_string.length();
        char number_char = number_in_string.charAt(number_length-1);
        return Integer.parseInt(String.valueOf(number_char));
    }

    public int Third() {
        String number_in_string = Integer.toString(this.b);
        int number_length = number_in_string.length();
        return Integer.parseInt(String.valueOf(number_in_string.charAt(0)));

    }
    public int Forth() {
        String number_in_string = Integer.toString(this.c);
        int sumer_of_numbers = 0;
        for (int i=0; i < number_in_string.length(); i++){
            char digit = number_in_string.charAt(i);
            int digit_in_int = Integer.parseInt(String.valueOf(digit));
            sumer_of_numbers += digit_in_int;
        }
        return sumer_of_numbers;
    }
    public int Fifth() {
        System.out.println(Second() * Third());
        int num = Second() * Third();
        return num;
    }
    public void Sixth() {
        System.out.println(Forth() + Fifth());
    }

}