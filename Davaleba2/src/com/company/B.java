package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    Integer a;
    Integer b;
    Integer c;
    public void First(){
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

    public void Second(){
        int [] array = {this.a, this.b, this.c};
        Arrays.sort(array);
        System.out.println("Highest is: " + array[2]);

    }

    public void Third(){
        int [] array = {this.a, this.b, this.c};
        Arrays.sort(array);
        System.out.println("Lowest is: " + array[0]);
    }

}
