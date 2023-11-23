package baseball.domain;

import static baseball.utils.StringConstant.*;

public enum Result {
    STRIKE(STRIKE_UNIT),
    BALL(BALL_UNIT),
    NOTHING(NOTHING_UNIT);

    Result(String message) { }
}
