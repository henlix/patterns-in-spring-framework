package org.sopt.patterns.impl.adapter;

public class AdapterServiceA {

    ServiceA a = new ServiceA();

    public void run() {

        System.out.print("AdapterServiceA.execute() -> ");
        a.run();
    }
}
