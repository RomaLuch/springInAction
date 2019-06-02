import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-chapter4.xml");

        Performer eddie = (Performer) applicationContext.getBean("eddie");
        eddie.perform();

    }
}
