package baseball.game;

import baseball.score.Score;
import baseball.userNumber.UserNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Game {

    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String GAME_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String NEW_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printInputMessage() {
        System.out.print(GAME_INPUT_MESSAGE);
    }

    public static void successGame() {
        System.out.println(GAME_END_MESSAGE);
    }

    public static void doGame(List<Integer> computerNumber) {
        while (true) {
            printInputMessage();
            List<Integer> input = UserNumber.getUserNumber();
            if (Score.checkScore(input, computerNumber)) {
                break;
            }
        }
    }

    public static boolean newGame() {
        System.out.println(NEW_GAME_MESSAGE);
        String input = Console.readLine();
        if (input.equals("1")) {
            return true;
        }
        return false;
    }
}
