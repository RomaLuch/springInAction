package instruments;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    public void play() {
        System.out.println("BIAM BIAM BIAM");
    }
}
