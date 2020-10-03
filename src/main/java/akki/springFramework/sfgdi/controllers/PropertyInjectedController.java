package akki.springFramework.sfgdi.controllers;

import akki.springFramework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String greetingService(){
        return greetingService.sayHello();
    }

}
