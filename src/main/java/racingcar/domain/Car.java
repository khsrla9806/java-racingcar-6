package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private StringBuilder currentStatus;

    public Car(String name) {
        this.name = name;
        this.currentStatus = new StringBuilder();
    }

    public void decideMoveOrNot() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            currentStatus.append("-");
        }
    }

}
