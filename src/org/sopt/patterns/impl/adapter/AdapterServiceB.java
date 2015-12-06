package org.sopt.patterns.impl.adapter;

public class AdapterServiceB {

    ServiceB b = new ServiceB();

    public void run() {

        System.out.print("AdapterServiceB.execute() -> ");
        b.run();
    }
}
