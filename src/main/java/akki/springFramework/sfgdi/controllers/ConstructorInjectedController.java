package akki.springFramework.sfgdi.controllers;

import akki.springFramework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetingService(){
        return greetingService.sayHello();
    }
}
