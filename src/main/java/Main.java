import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-chapter4.xml");

        Performer kenyAutowireByAnotation = (Performer) applicationContext.getBean("kenyAutowireAnotation");
        kenyAutowireByAnotation.perform();

    }
}
