package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

import static baseball.utils.NumberConstant.*;

public class Answer {
    private final List<Integer> numbers;

    public Answer() {
        numbers = Randoms.pickUniqueNumbersInRange(START_NUM, END_NUM, NUMBERS_SIZE);
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
