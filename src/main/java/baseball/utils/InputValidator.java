package baseball.utils;

import baseball.exception.InvalidGuessValueException;
import baseball.exception.InvalidReplayValueException;
import baseball.exception.TooManyGuessException;

import java.util.stream.IntStream;

import static baseball.utils.NumberConstant.*;
import static baseball.utils.StringConstant.CHAR_ZERO;

public class InputValidator {
    public static void validateGuess(String input) throws IllegalArgumentException {
        validateGuessNum(input);
        validateGuessSize(input);
    }

    private static void validateGuessNum(String input) {
        IntStream.range(ZERO, input.length()).forEach(i -> {
            int difference = input.charAt(i) - CHAR_ZERO;

            if (difference < MIN_DIFF || difference > MAX_DIFF)
                throw new InvalidGuessValueException();
        });
    }

    private static void validateGuessSize(String input) {
        if (input.length() > NUMBERS_SIZE)
            throw new TooManyGuessException();
    }


    public static void validateReplay(String input) throws IllegalArgumentException {
        try {
            int replayNum = Integer.parseInt(input);

            if (replayNum != REPLAY_NUM && replayNum != QUIT_NUM)
                throw new InvalidReplayValueException();
        } catch (IllegalArgumentException e) {
            throw new InvalidReplayValueException();
        }
    }
}
