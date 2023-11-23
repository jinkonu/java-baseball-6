package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;
import java.util.stream.IntStream;

import static baseball.domain.Result.*;
import static baseball.utils.NumberConstant.*;

public class Answer {

    private final List<Integer> numbers;

    public Answer() {
        numbers = Randoms.pickUniqueNumbersInRange(START_NUM, END_NUM, NUMBERS_SIZE);
    }

    public Map<Result, Integer> matches(int[] guessNumbers) {
        Map<Result, Integer> results = new EnumMap<>(Result.class);

        IntStream.range(ZERO, NUMBERS_SIZE).forEach(i -> {
            Result result = matchOneByOne(numbers.get(i), guessNumbers[i]);
            increaseResult(results, result);
        });

        return results;
    }

    private Result matchOneByOne(int answer, int guess) {
        if (answer == guess) return STRIKE;
        if (numbers.contains(guess)) return BALL;

        return NOTHING;
    }

    private void increaseResult(Map<Result, Integer> results, Result result) {
        results.putIfAbsent(result, INITIAL_RESULT_VALUE);
        results.computeIfPresent(result, (key, value) -> value + RESULT_INCREMENT_NUM);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return numbers.equals(answer.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }
}
