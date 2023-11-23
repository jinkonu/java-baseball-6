package baseball.view;

import baseball.utils.InputValidator;

import java.util.List;
import java.util.stream.IntStream;

import static baseball.view.OutputView.*;
import static camp.nextstep.edu.missionutils.Console.readLine;
import static baseball.utils.NumberConstant.*;
import static baseball.utils.StringConstant.*;

public class InputView {

    public static List<Integer> readGuess() {
        printGuessInputForm();
        String input = readLine();

        try {
            InputValidator.validateGuess(input);
            return parseGuess(input);
        } catch (IllegalArgumentException e) {
            printError(e);
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


    public static int readReplay() {
        String input = readLine();

        try {
            InputValidator.validateReplay(input);
            return parseReplay(input);
        } catch (IllegalArgumentException e) {
            printError(e);
            return readReplay();
        }
    }

     private static int parseReplay(String input) {
         return Integer.parseInt(input);
     }
}
