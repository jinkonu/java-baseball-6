package baseball.utils;

import static baseball.utils.NumberConstant.*;

public class StringConstant {

    /* RESULT */
    public static final String STRIKE_UNIT = "스트라이크";
    public static final String BALL_UNIT = "볼";
    public static final String NOTHING_UNIT = "낫싱";


    /* INPUT */
    public static final char CHAR_ZERO = '0';


    /* ERROR */
    public static final String ERROR_PREFIX = "[ERROR] ";

    public static final String INVALID_GUESS_VALUE_ERROR = START_NUM + " ~ " + END_NUM + " 사이의 값을 입력해주세요.";
    public static final String TOO_MANY_GUESS_ERROR = NUMBERS_SIZE + " 이하의 개수를 입력해주세요.";

    public static final String INVALID_REPLAY_VALUE_ERROR = REPLAY_NUM + " 혹은 " + QUIT_NUM + "을 입력해주세요.";
}
