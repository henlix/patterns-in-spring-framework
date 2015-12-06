package org.sopt.patterns.impl.proxy;

import org.sopt.patterns.base.IService;
import org.sopt.patterns.base.Service;

public class Proxy implements IService {

    IService service;

    @Override
    public String execute() {

        service = new Service();
        return service.execute();
    }
}
