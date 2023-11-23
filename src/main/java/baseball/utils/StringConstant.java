package baseball.utils;

import static baseball.utils.NumberConstant.*;

public class StringConstant {

    /* RESULT */
    public static final String STRIKE_UNIT = "스트라이크";
    public static final String BALL_UNIT = "볼";
    public static final String NOTHING = "낫싱";


    /* INPUT */
    public static final char CHAR_ZERO = '0';


    /* OUTPUT */
    public static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String GUESS_INPUT_FORM_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String SUCCESS_MESSAGE = SUCCESS_NUM + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String RESTART_MESSAGE = "게임을 새로 시작하려면 "+ REPLAY_NUM + ", 종료하려면 "+ QUIT_NUM + "를 입력하세요.";


    /* ERROR */
    public static final String ERROR_PREFIX = "[ERROR] ";

    public static final String INVALID_GUESS_VALUE_ERROR = START_NUM + " ~ " + END_NUM + " 사이의 값을 입력해주세요.";
    public static final String TOO_MANY_GUESS_ERROR = NUMBERS_SIZE + " 이하의 개수를 입력해주세요.";
    public static final String DUPLICATE_GUESS_ERROR = "서로 같지 않은 수를 입력해주세요.";

    public static final String INVALID_REPLAY_VALUE_ERROR = REPLAY_NUM + " 혹은 " + QUIT_NUM + "을 입력해주세요.";
}
