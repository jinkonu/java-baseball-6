package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static baseball.utils.NumberConstant.*;
import static org.assertj.core.api.Assertions.assertThat;

class AnswerTest {

    @DisplayName("정답 객체와 비교하여 결과 세트 반환")
    @ValueSource(ints = {1, 2, 3})
    @ParameterizedTest
    void matchesFromParameterNumbers(int num) {
        List<Integer> guess = new ArrayList<>();
        guess.add(num);
        guess.add(num + 1);
        guess.add(num + 2);

        Answer answer = Answer.create();
        Map<Result, Integer> results = answer.matches(guess);

        assertThat(results.values().stream()
                .mapToInt(Integer::intValue)
                .sum()).isEqualTo(NUMBERS_SIZE);
    }
}