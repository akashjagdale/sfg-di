package akki.springFramework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hello World..! :: Primary ";
    }
}
