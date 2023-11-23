package baseball.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SuppressWarnings("ALL")
class InputValidatorTest {

    @DisplayName("사용자의 잘못된 답 입력값에 대해 예외 발생")
    @ValueSource(strings = {"12a", "c", "000", "1234"})
    @ParameterizedTest
    void validateGuess_사용자의_잘못된_답_입력값에_대해_예외_발생(String input) {
        assertThatThrownBy(() ->
                InputValidator.validateGuess(input)
        ).isInstanceOf(IllegalArgumentException.class);
    }


    @DisplayName("사용자의 잘못된 재시작, 종료 입력값에 대해 예외 발생")
    @ValueSource(strings = {"0", "a", "3", "11"})
    @ParameterizedTest
    void validateReplay_사용자의_잘못된_재시작_종료_입력값에_대해_예외_발생(String input) {
        assertThatThrownBy(() ->
                InputValidator.validateReplay(input)
        ).isInstanceOf(IllegalArgumentException.class);
    }
}