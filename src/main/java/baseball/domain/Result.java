package baseball.domain;

import baseball.view.OutputView;

import java.util.Map;

import static baseball.utils.StringConstant.*;
import static baseball.utils.NumberConstant.*;

public enum Result {

    STRIKE(STRIKE_UNIT),
    BALL(BALL_UNIT);

    private final String unit;

    Result(String unit) {
        this.unit = unit;
    }

    public static void printResults(Map<Result, Integer> results) {
        if (isNothing(results))
            OutputView.printNothing();

        results.forEach((key, value) -> OutputView.printResult(key.unit, value));
    }

    private static boolean isNothing(Map<Result, Integer> results) {
        return results.values().stream()
                .mapToInt(Integer::intValue)
                .sum() == ZERO;
    }

    public static boolean checkResults(Map<Result, Integer> results) {
        return results.get(STRIKE) == SUCCESS_NUM;
    }
}
