package technikum.at.jannikschwerdtner_abschlusspruefungslm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HammingWeightController {

    HammerWeight hammerWeight = new HammerWeight();

    @GetMapping("/hamming")
    public int calculateHammingWeight(@RequestParam int number) {
        return hammerWeight.getHammingWeight(number);
    }

}
