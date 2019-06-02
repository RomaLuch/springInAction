import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-chapter5.xml");
        Performer eddie = (Performer) context.getBean("eddie");
        eddie.perform();
    }
}
