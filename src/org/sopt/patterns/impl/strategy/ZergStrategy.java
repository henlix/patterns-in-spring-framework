package org.sopt.patterns.impl.strategy;

import org.sopt.patterns.base.IStrategy;

public class ZergStrategy implements IStrategy {

    @Override
    public void execute() {

        System.out.println("내가 바로 칼날 여왕이다.");
    }
}
