package com.dmdev.tasks.encapsulation.home;

public class AtmRunner {

    public static void main(String[] args) {
        Atm atm = new Atm(19, 100, 22);
        System.out.println(atm.withdrawCash(1180));
    }
}
