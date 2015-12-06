package org.sopt.patterns.impl.decorator;

import org.sopt.patterns.base.IService;
import org.sopt.patterns.base.Service;

public class Decorator implements IService {

    IService service;

    @Override
    public String execute() {

        service = new Service();
        return "From Decorator : " + service.execute();
    }
}
