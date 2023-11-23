package baseball.exception;

import static baseball.utils.StringConstant.*;

public class InvalidGuessValueException extends IllegalArgumentException {
    public InvalidGuessValueException() {
        super(INVALID_GUESS_VALUE_ERROR);
    }
}
