package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.First();
        a.Second();
        a.Third();
        System.out.println("------------------------------------------");
        b.First();
        b.Second();
        b.Third();
        System.out.println("------------------------------------------");
        c.First();
        c.Second();
        c.Third();
        c.Forth();
        c.Fifth();
        c.Sixth();

    }
}
