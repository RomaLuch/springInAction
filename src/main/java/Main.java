import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-chapter4.xml");

        Performer kenyWithInstrumentByName = (Performer) applicationContext.getBean("kenyAutowireByName");
        kenyWithInstrumentByName.perform();

        Performer kenyWithInstrumentByType = (Performer) applicationContext.getBean("kenyAutowireByType");
        kenyWithInstrumentByType.perform();

        Performer dukeWithConstructorArgDI = (Performer) applicationContext.getBean("duke");
        dukeWithConstructorArgDI.perform();

        Performer dukeAutowireConsructor = (Performer) applicationContext.getBean("dukeAutowireConsructor");
        dukeAutowireConsructor.perform();

    }
}
