package baseball.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.EnumMap;
import java.util.Map;

import static baseball.domain.Result.*;
import static baseball.utils.NumberConstant.*;
import static baseball.utils.StringConstant.*;
import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("ALL")
class ResultTest {

    private PrintStream standardOut;
    private OutputStream captor;

    @BeforeEach
    private final void init() {
        standardOut = System.out;
        captor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captor));
    }

    @AfterEach
    private final void printOutput() {
        System.setOut(standardOut);
        System.out.println(output());
    }

    private final String output() {
        return captor.toString().trim();
    }


    @DisplayName("매칭 결과 Map으로부터 출력")
    @ValueSource(ints = {1, 2})
    @ParameterizedTest
    void printResults_Map으로부터_결과_출력(int size) {
        Map<Result, Integer> results = new EnumMap<>(Result.class);

        results.put(STRIKE, size);
        results.put(BALL, size);

        print(results);
        assertThat(output()).contains(
                size + STRIKE_UNIT,
                size + BALL_UNIT
        );
    }


    @DisplayName("매칭 결과 Map 비어있을 시 '낫싱' 출력")
    @Test
    void printResults_매칭_결과_없을_시_낫싱_출력() {
        Map<Result, Integer> results = new EnumMap<>(Result.class);

        print(results);
        assertThat(output()).contains(
                NOTHING
        );
    }


    @DisplayName("매칭 결과 Map으로부터 맞췄을 경우 true 출력")
    @Test
    void checkResults_매칭_결과_Map으로부터_맞췄을_경우_true_출력() {
        Map<Result, Integer> results = new EnumMap<>(Result.class);

        results.put(STRIKE, SUCCESS_NUM);

        assertThat(check(results)).isTrue();
    }
}