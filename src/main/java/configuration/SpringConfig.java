package configuration;

import instruments.Guitar;
import instruments.Instrument;
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
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        kenny.setInstrument(guitar());
        return kenny;
    }

}
