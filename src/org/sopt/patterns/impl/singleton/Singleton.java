package org.sopt.patterns.impl.singleton;

public class Singleton {

    private Singleton() {}

    private static Singleton instance = null;
    public synchronized static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();
        }

        return instance;
    }
}
