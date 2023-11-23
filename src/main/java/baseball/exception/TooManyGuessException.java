package baseball.exception;

import static baseball.utils.StringConstant.*;

public class TooManyGuessException extends IllegalArgumentException {
    public TooManyGuessException() {
        super(TOO_MANY_GUESS_ERROR);
    }
}
