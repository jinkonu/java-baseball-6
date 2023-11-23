package baseball.exception;

import static baseball.utils.StringConstant.*;

public class GuessSizeException extends IllegalArgumentException {
    public GuessSizeException() {
        super(GUESS_SIZE_ERROR);
    }
}
