package technikum.at.jannikschwerdtner_abschlusspruefungslm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HammingWeightController {

    private int lastNumber;


    @GetMapping("/hamming")
    public int calculateHammingWeight(@RequestParam("number") int number) {
        lastNumber = number;
        return getHammingWeight(number);
    }

    @GetMapping("/hamming/last")
    public int getLastNumber() {
        return lastNumber % 10;
    }

    private int getHammingWeight(int number) {
        int weight = 0;
        String numberString = String.valueOf(number);
        for (char c : numberString.toCharArray()) {
            if (c != '0') {
                weight++;
            }
        }
        return weight;
    }
}
