package org.sopt.patterns.base;

public class Player {

    public void play(IStrategy strategy) {

        strategy.execute();
    }
}
