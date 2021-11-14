package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;
import racingcar.domain.Record;
import racingcar.domain.collection.CarCollection;
import racingcar.domain.collection.RecordCollection;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

public class RecordTest {

    private RacingCars racingCars;
    private  List<RacingCar> car;

    @BeforeEach
    void setUp() {
        List<String> carName = Arrays.asList("lee","kim","tt");
        car = CarCollection.racingGameReady(carName);

        racingCars = RacingCars.create(car);
    }

    @Test
    @DisplayName("Record의 필수값이 null인 경우 예외 발생 검증")
    void createRecordException() {
        // when & then
        assertThatNullPointerException().isThrownBy(() -> RecordCollection.create(3, null));
    }

    @ParameterizedTest
    @DisplayName("Record 객체 생성 테스트")
    @ValueSource(ints = {3,5,7})
    void createTest(int tryCount) {
        Record record = RecordCollection.create(tryCount, car);

        assertThat(record.getCars().getCars()).isEqualTo(RacingCars.create(car).getCars());
    }
}
