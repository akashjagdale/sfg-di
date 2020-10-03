package akki.springFramework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingsService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World..! :: Property";
    }
}
