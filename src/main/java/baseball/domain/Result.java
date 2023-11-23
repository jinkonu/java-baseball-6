package baseball.domain;

import baseball.view.OutputView;

import java.util.Map;

import static baseball.utils.StringConstant.*;
import static baseball.utils.NumberConstant.*;

public enum Result {

    STRIKE(STRIKE_UNIT),
    BALL(BALL_UNIT),
    NOTHING(NOTHING_UNIT);

    private final String unit;

    Result(String unit) {
        this.unit = unit;
    }

    public static void printResults(Map<Result, Integer> results) {
        results.forEach((key, value) -> OutputView.printResult(key.unit, value));
    }

    public static boolean checkResults(Map<Result, Integer> results) {
        return results.get(STRIKE) == SUCCESS_NUM;
    }
}
