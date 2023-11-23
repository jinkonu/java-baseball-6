package baseball.domain;

import java.util.Map;

import static baseball.utils.NumberConstant.*;
import static baseball.view.InputView.readGuess;
import static baseball.view.InputView.readReplay;
import static baseball.view.OutputView.*;

public class BaseballGame {

    private Answer answer;

    public static void run() {
        printStart();

        BaseballGame game = new BaseballGame();
        game.play();
    }


    private BaseballGame() {
        answer = Answer.create();
    }


    private void play() {
        while (!guess());

        printSuccess();
        printRestart();

        if (isReplay()) {
            answer = Answer.create();
            play();
        }
    }


    private boolean guess() {
        Map<Result, Integer> results = answer.matches(readGuess());

        Result.print(results);
        return Result.check(results);
    }


    private boolean isReplay() {
        return readReplay() == REPLAY_NUM;
    }
}
