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

    public List<Result> matches(int[] guessNumbers) {
        List<Result> results = new ArrayList<>();

        IntStream.range(ZERO, NUMBERS_SIZE).forEach(i -> {
            results.add(matchOneByOne(numbers.get(i), guessNumbers[i], i));
        });

        return results;
    }

    private Result matchOneByOne(int answer, int guess, int idx) {
        if (answer == guess) return STRIKE;
        if (numbers.contains(guess)) return BALL;

        return NOTHING;
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
