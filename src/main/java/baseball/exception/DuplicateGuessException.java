package baseball.exception;

import static baseball.utils.StringConstant.*;

public class DuplicateGuessException extends IllegalArgumentException {
    public DuplicateGuessException() {
        super(DUPLICATE_GUESS_ERROR);
    }
}
