package fourth_racing_ranking;

import java.util.List;
import java.util.Random;

public class CarAction {

    private static final int ALLOW_MOVE_NUMBER = 4;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int RANDOM_MIN_NUMBER = 0;

    public List<Car> start(List<Car> carList, int tryNumber) {
        Resultview resultview = new Resultview();

        for (int i = 0; i < tryNumber-1 ; i++) {
            racing(carList);
        }

        return carList;
    }

    private void racing(List<Car> carList) {
        Resultview resultview = new Resultview();

        resultview.getDivideLine();

        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);

            isMove(car);

            resultview.draw(car);
        }
    }

    public static void isMove(Car car) {
        if (random() < ALLOW_MOVE_NUMBER) {
            car.move();
        }

        return;
    }

    public static int random() {
        int randomValue = new Random().nextInt(RANDOM_MAX_NUMBER+1) + RANDOM_MIN_NUMBER;

        if (randomValue < RANDOM_MIN_NUMBER || randomValue > RANDOM_MAX_NUMBER) {
            throw new IllegalArgumentException(RANDOM_MIN_NUMBER + "~" + RANDOM_MAX_NUMBER+1 + "만 허용");
        }

        return randomValue;
    }
}