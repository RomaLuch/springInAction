import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.MindReader;
import performers.Thinker;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-chapter5.xml");
        MindReader magician = (MindReader) context.getBean("magician");
        Thinker volunteer = (Thinker) context.getBean("volunteer");

        volunteer.thinkOfSomething("Queen of Hearts");

        System.out.println("Queen of Hearts".equals(magician.getThoughts()));
    }


}
