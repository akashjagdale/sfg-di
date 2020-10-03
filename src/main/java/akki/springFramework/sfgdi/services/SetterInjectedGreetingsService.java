package akki.springFramework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingsService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World..! :: Setter";
    }
}
