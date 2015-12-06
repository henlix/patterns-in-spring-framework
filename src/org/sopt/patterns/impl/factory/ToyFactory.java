package org.sopt.patterns.impl.factory;

public class ToyFactory extends Factory {

    @Override
    public Item create() {

        return new Toy();
    }
}
