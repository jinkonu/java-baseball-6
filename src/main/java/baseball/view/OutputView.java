package baseball.view;

import static baseball.utils.StringConstant.*;

public class OutputView {

    public static void printStart() {
        System.out.println(START_MESSAGE);
    }

    public static void printGuessInputForm() {
        System.out.print(GUESS_INPUT_FORM_MESSAGE);
    }

    public static void printResult(String unit, int size) {
        System.out.println(size + unit);
    }

    public static void printNothing() {
        System.out.println(NOTHING);
    }

    public static void printSuccess() {
        System.out.println(SUCCESS_MESSAGE);
    }

    public static void printRestart() {
        System.out.println(RESTART_MESSAGE);
    }


    public static void printError(Exception e) {
        System.out.println(ERROR_PREFIX + e.getMessage());
    }
}
