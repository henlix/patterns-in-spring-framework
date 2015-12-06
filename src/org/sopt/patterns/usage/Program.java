package org.sopt.patterns.usage;

import org.sopt.patterns.base.IService;
import org.sopt.patterns.base.Player;
import org.sopt.patterns.impl.adapter.AdapterServiceA;
import org.sopt.patterns.impl.adapter.AdapterServiceB;
import org.sopt.patterns.impl.adapter.ServiceA;
import org.sopt.patterns.impl.adapter.ServiceB;
import org.sopt.patterns.impl.decorator.Decorator;
import org.sopt.patterns.impl.factory.Factory;
import org.sopt.patterns.impl.factory.Item;
import org.sopt.patterns.impl.factory.ToyFactory;
import org.sopt.patterns.impl.proxy.Proxy;
import org.sopt.patterns.impl.singleton.Singleton;
import org.sopt.patterns.impl.strategy.ProtossStrategy;
import org.sopt.patterns.impl.strategy.TerranStrategy;
import org.sopt.patterns.impl.strategy.ZergStrategy;
import org.sopt.patterns.impl.template.Task;
import org.sopt.patterns.impl.template.TaskImpl;

public class Program {

    public static void main(String[] args) {

        System.out.println("[Adapter Pattern]");

        ServiceA a = new ServiceA();
        ServiceB b = new ServiceB();

        a.run();
        b.run();

        System.out.println();

        AdapterServiceA aa = new AdapterServiceA();
        AdapterServiceB ab = new AdapterServiceB();

        aa.run();
        ab.run();



        System.out.println("\n[Proxy Pattern]");

        IService proxy = new Proxy();
        System.out.println(proxy.execute());



        System.out.println("\n[Decorator Pattern]");

        IService decorator = new Decorator();
        System.out.println(decorator.execute());



        System.out.println("\n[Singleton Pattern]");

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        System.out.println("\n[Template Pattern]");

        Task<String, String> task = new TaskImpl("Hello, Design Patterns with Spring Framework !!");
        task.execute();



        System.out.println("\n[Template Pattern]");

        Factory factory = new ToyFactory();

        Item alpha = factory.create();
        Item beta = factory.create();
        Item gamma = factory.create();

        alpha.identify();
        beta.identify();
        gamma.identify();



        System.out.println("\n[Strategy Pattern]");

        Player player = new Player();

        player.play(new ProtossStrategy());
        player.play(new TerranStrategy());
        player.play(new ZergStrategy());



        System.out.println("\n[Template Callback Pattern]");

        player.play(() -> System.out.println("저항은 무의미하다. 나의 사도들이 새 시대를 열 것이다."));
    }
}
