import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Performer duke = (Performer) applicationContext.getBean("duke");
//        duke.perform();

        Performer poeticDuke = (Performer) applicationContext.getBean("poeticDuke");
//        poeticDuke.perform();

        Performer keny = (Performer) applicationContext.getBean("keny");
//        keny.perform();

        Performer kenyPianist = (Performer) applicationContext.getBean("kenyPianist");
        kenyPianist.perform();
    }
}
