package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.util.PrintMsg;

import java.util.List;

public class InputView {
    public String getUserInput() {
        return Console.readLine();
    }

    /**
     * 코치 이름 입력 함수
     * @return
     */
    public List<String> readCoachNames() {
        String uesrInput = getUserInput();
        uesrInput.split(PrintMsg.COMMA.getMsg());
        return null;
    }
    public List<String> checkCoachNames() {
        return null;
    }

    /**
     * 코치 당 못 먹는 메뉴 입력 함수
     * @return
     */
    public List<String> readNotEat() {
        String uesrInput = getUserInput();
        return null;
    }
}
