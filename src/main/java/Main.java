import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("configuration");
        Performer duke = (Performer) context.getBean("duke");
        Performer keny = (Performer) context.getBean("kenny");
        duke.perform();
        keny.perform();

    }
}
