package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Map;

import static baseball.utils.NumberConstant.*;
import static org.assertj.core.api.Assertions.assertThat;

class AnswerTest {

    @DisplayName("정답 객체와 비교하여 결과 세트 반환")
    @ValueSource(ints = {1, 2, 3})
    @ParameterizedTest
    void matchesFromParameterNumbers(int num) {
        int[] guessNumbers = new int[NUMBERS_SIZE];
        Arrays.fill(guessNumbers, num);

        Answer answer = new Answer();
        Map<Result, Integer> results = answer.matches(guessNumbers);

        assertThat(results.values().stream()
                .mapToInt(Integer::intValue)
                .sum()).isEqualTo(NUMBERS_SIZE);
    }
}