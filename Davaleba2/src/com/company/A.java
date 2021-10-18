package com.company;

import java.util.Scanner;

public class A {
    public Integer a;
    public Integer b;
    public void First(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        this.a = sc.nextInt();
        Scanner sc_1 = new Scanner(System.in);
        System.out.print("Enter b: ");
        this.b = sc_1.nextInt();
    }

    public void Second(){
        int sum_of_a_b = this.a + this.b;
        System.out.println("Sum of a and b: " + sum_of_a_b);
    }

    public void Third(){
        int multiplication = this.a * this.b;
        System.out.println("a multiplied on b: " + multiplication);
    }

}
