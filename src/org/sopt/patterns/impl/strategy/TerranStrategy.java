package org.sopt.patterns.impl.strategy;

import org.sopt.patterns.base.IStrategy;

public class TerranStrategy implements IStrategy {

    @Override
    public void execute() {

        System.out.println("안녕하신가, 친구들. 나는 짐 레이너, 이 지역 보안관이지.");
    }
}
