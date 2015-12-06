package org.sopt.patterns.impl.factory;

public class Toy extends Item {

    private static int COUNTER = 1;
    private int id = COUNTER++;

    @Override
    public void identify() {

        System.out.println("Toy@ID : " + id);
    }
}
