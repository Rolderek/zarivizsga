package digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    private Set<Integer> setNumber(String str) {
        Set<Integer> num = new HashSet<>();
        for (Character chars: str.toCharArray()) {
            if (Character.isDigit(chars)) {
                num.add(Character.getNumericValue(chars));
            }
        }
        return num;
    }

    public int getCountOfDigits(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return setNumber(str).size();
    }
}
