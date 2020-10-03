package akki.springFramework.sfgdi.controllers;

import akki.springFramework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // @Autowired // Optional from Spring 4.4.2
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetingService() {
        return greetingService.sayHello();
    }
}
