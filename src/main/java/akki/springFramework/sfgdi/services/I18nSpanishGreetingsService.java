package akki.springFramework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingsService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hola Mundo :- ES";
    }
}
