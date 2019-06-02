package configuration;

import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import performers.Instrumentalist;
import performers.Juggler;
import performers.Performer;

@Configuration
public class SpringConfig {

    @Bean
    public Performer duke() {
        return new Juggler(15);
    }

    @Bean
    public Instrument guitar() {
        return new Guitar();
    }

    @Bean
    public Instrument piano() {
        return new Piano();
    }

    @Bean
    public Performer kenny() {
        return new Instrumentalist("Jingle Bells", guitar());
    }

    @Bean
    public Performer kenny1() {
        Instrumentalist kenny1 = new Instrumentalist();
        kenny1.setSong("Let It Be");
        kenny1.setInstrument(piano());
        return kenny1;
    }

}
