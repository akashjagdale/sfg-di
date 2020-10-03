package akki.springFramework.sfgdi.controllers;

import akki.springFramework.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetingService(){
        return greetingService.sayHello();
    }
}
