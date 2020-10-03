package akki.springFramework.sfgdi;

import akki.springFramework.sfgdi.controllers.ConstructorInjectedController;
import akki.springFramework.sfgdi.controllers.MyController;
import akki.springFramework.sfgdi.controllers.PropertyInjectedController;
import akki.springFramework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        String greetings = myController.sayHello();
        System.out.println("My Controller :: "+greetings);

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println("Property Injection :: "+propertyInjectedController.greetingService());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println("Setter Injection :: "+setterInjectedController.greetingService());

        ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println("Constructor Injection :: "+constructorInjectedController.greetingService());

    }
}
