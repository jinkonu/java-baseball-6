package baseball.utils;

import baseball.exception.DuplicateGuessException;
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
        validateGuessDuplicate(input);
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

    private static void validateGuessDuplicate(String input) {
        for (int i = ZERO; i < input.length(); i++)
            for (int j = ZERO + 1; j < input.length() - 1; j++)
                if (i == j) throw new DuplicateGuessException();
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
