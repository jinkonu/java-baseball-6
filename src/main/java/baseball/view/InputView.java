package baseball.view;

import baseball.utils.InputValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static baseball.utils.NumberConstant.*;
import static baseball.utils.StringConstant.*;

public class InputView {

    public static List<Integer> readGuess() {
        String input = readLine();

        try {
            InputValidator.validateGuess(input);
            return parseGuess(input);
        } catch (IllegalArgumentException e) {
            return readGuess();
        }
    }

    private static List<Integer> parseGuess(String input) {
        return IntStream.range(ZERO, NUMBERS_SIZE)
                .mapToObj(i -> parseInt(input.charAt(i)))
                .toList();
    }

    private static int parseInt(char c) {
        return c - CHAR_ZERO;
    }
}
