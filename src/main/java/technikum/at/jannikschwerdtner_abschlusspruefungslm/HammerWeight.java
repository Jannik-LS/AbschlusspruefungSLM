package technikum.at.jannikschwerdtner_abschlusspruefungslm;

public class HammerWeight {

    public int getHammingWeight(int number) {
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
