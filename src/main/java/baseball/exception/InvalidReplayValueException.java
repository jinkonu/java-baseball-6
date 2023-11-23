package baseball.exception;

import static baseball.utils.StringConstant.*;

public class InvalidReplayValueException extends IllegalArgumentException {
    public InvalidReplayValueException() {
        super(INVALID_REPLAY_VALUE_ERROR);
    }
}
